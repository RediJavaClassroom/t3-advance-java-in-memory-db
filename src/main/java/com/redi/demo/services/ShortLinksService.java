package com.redi.demo.services;

import com.redi.demo.model.CreateShortLinkRequest;
import com.redi.demo.model.ShortLink;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.redi.demo.repository.DefaultShortLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShortLinksService {

  final private KeyGenerationService keyGenerationService;
  final private DefaultShortLinkRepository shortLinkRepository;

  private final String BASE_URL = "http://localhost:8080";
  private final Map<String, URI> shortLinks = new ConcurrentHashMap<>();

  @Autowired
  public ShortLinksService(final KeyGenerationService keyGenerationService, final DefaultShortLinkRepository defaultShortLinkRepository) {
    this.keyGenerationService = keyGenerationService;
    this.shortLinkRepository = defaultShortLinkRepository;
  }

  public ShortLink createShortLink(final CreateShortLinkRequest request) {
    final String key = keyGenerationService.generateKey();
    shortLinks.put(key, request.originalURL);
    final var uri = URI.create(String.format("%s/%s", BASE_URL, key));
    final ShortLink shortLink = new ShortLink(uri, request.originalURL);
    shortLinkRepository.save(shortLink);
    return shortLink;
  }

  public URI expandShortLink(final String key) {
    //return shortLinks.get(key);
    final URI uri = URI.create(String.format("%s/%s", BASE_URL, key));
    return shortLinkRepository.getById(uri).getOriginalUrl();
  }
}

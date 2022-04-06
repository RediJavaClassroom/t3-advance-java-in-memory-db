package com.redi.demo.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.net.URI;

@Entity
public class ShortLink {

    @Id
    private URI originalUrl;
    private URI url;

    public ShortLink(final URI url, final URI originalUrl) {
        this.url = url;
        this.originalUrl = originalUrl;
    }

    public ShortLink() {

    }

    @javax.persistence.Id
    public URI getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(final URI shortUrl) {
        this.originalUrl = shortUrl;
    }

    public URI getUrl() {
        return url;
    }

    public void setUrl(final URI url) {
        this.url = url;
    }
}

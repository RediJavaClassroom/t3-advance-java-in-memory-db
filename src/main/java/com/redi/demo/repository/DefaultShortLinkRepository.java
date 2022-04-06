package com.redi.demo.repository;

import com.redi.demo.model.ShortLink;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

@Service
public class DefaultShortLinkRepository implements JpaRepository<ShortLink, URI> {

    private Map<URI, ShortLink> shortLinks = new HashMap<URI, ShortLink>();

    @Override
    public List<ShortLink> findAll() {
        return null;
    }

    @Override
    public List<ShortLink> findAll(final Sort sort) {
        return null;
    }

    @Override
    public Page<ShortLink> findAll(final Pageable pageable) {
        return null;
    }

    @Override
    public List<ShortLink> findAllById(final Iterable<URI> uris) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(final URI uri) {

    }

    @Override
    public void delete(final ShortLink entity) {

    }

    @Override
    public void deleteAllById(final Iterable<? extends URI> uris) {

    }

    @Override
    public void deleteAll(final Iterable<? extends ShortLink> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends ShortLink> S save(final S entity) {
        shortLinks.put(entity.getUrl(), entity);
        return entity;
    }

    @Override
    public <S extends ShortLink> List<S> saveAll(final Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ShortLink> findById(final URI uri) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(final URI uri) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends ShortLink> S saveAndFlush(final S entity) {
        return null;
    }

    @Override
    public <S extends ShortLink> List<S> saveAllAndFlush(final Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(final Iterable<ShortLink> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(final Iterable<URI> uris) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ShortLink getOne(final URI uri) {
        return null;
    }

    @Override
    public ShortLink getById(final URI uri) {
        return shortLinks.get(uri);
    }

    @Override
    public <S extends ShortLink> Optional<S> findOne(final Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ShortLink> List<S> findAll(final Example<S> example) {
        return null;
    }

    @Override
    public <S extends ShortLink> List<S> findAll(final Example<S> example, final Sort sort) {
        return null;
    }

    @Override
    public <S extends ShortLink> Page<S> findAll(final Example<S> example, final Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ShortLink> long count(final Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ShortLink> boolean exists(final Example<S> example) {
        return false;
    }

    @Override
    public <S extends ShortLink, R> R findBy(final Example<S> example, final Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}

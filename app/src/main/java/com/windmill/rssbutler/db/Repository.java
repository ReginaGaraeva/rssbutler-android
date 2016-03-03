package com.windmill.rssbutler.db;

import com.windmill.rssbutler.domain.Entity;

import java.util.List;

public interface Repository<T> {
    public List<T> select();

    public void delete(T entity);

    public void update(T entity);

    public void insert(T entity);
}

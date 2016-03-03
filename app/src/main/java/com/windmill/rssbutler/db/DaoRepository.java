package com.windmill.rssbutler.db;

import android.content.Entity;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

public class DaoRepository<T extends Entity> implements Repository<T> {
    private Dao<T, Integer> entities;

    public DaoRepository(Class<T> clazz, OrmLiteSqliteOpenHelper helper) {
        try {
            entities = helper.getDao(clazz);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create Dao for " + clazz.getSimpleName(), e);
        }
    }

    @Override
    public List<T> select() {
        try {
            return entities.queryForAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(T entity) {
        try {
            entities.delete(entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(T entity) {
        try {
            entities.update(entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insert(T entity) {
        try {
            entities.create(entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


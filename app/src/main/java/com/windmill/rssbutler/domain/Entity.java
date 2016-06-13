package com.windmill.rssbutler.domain;

import com.j256.ormlite.field.DatabaseField;

public class Entity {
    public static final int UNKNOWN_ID = 0;

    @DatabaseField(id = true, unique = true)
    protected long id;

    public long getId(){
        return id;
    }

    public boolean hasId(){
        return id == UNKNOWN_ID;
    }
}

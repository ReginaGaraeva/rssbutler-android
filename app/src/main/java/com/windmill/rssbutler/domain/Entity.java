package com.windmill.rssbutler.domain;

public class Entity {
    public static final long UNKNOWN_ID = 0;

    protected long id;

    public long getId(){
        return id;
    }

    public boolean hasId(){
        return id == UNKNOWN_ID;
    }
}

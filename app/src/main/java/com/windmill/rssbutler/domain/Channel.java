package com.windmill.rssbutler.domain;

public class Channel extends Entity {
    private String title;
    private String description;
    private String link;

    public Channel(long id, String title, String link){
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Channel(String title, String link){
        this(UNKNOWN_ID, title, link);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setLink(String link){
        this.link = link;
    }

    public String getLink(){
        return link;
    }

    public Channel withTitle(String title){
        setTitle(title);
        return this;
    }

    public Channel withDescription(String description){
        setDescription(description);
        return this;
    }

    public Channel fromLink(String link){
        setLink(link);
        return this;
    }
}

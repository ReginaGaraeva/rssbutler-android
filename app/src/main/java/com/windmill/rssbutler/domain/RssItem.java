package com.windmill.rssbutler.domain;

import java.util.Date;

public class RssItem extends Entity{
    private Channel channel;
    private String title;
    private String description;
    private String link;
    private Date pubDate;

    public RssItem(long id, Channel channel){
        this.id = id;
        this.channel = channel;
    }

    public RssItem(Channel channel){
        this(UNKNOWN_ID, channel);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setChannel(Channel channel){
        this.channel = channel;
    }

    public Channel getChannel(){
        return channel;
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

    public void setPubDate(Date pubDate){
        this.pubDate = pubDate;
    }

    public Date getPubDate(){
        return pubDate;
    }

    public RssItem withTitle(String title){
        setTitle(title);
        return this;
    }

    public RssItem withDescription(String description){
        setDescription(description);
        return this;
    }

    public RssItem inChannel(Channel channel){
        setChannel(channel);
        return this;
    }

    public RssItem fromLink(String link){
        setLink(link);
        return this;
    }

    public RssItem withPubDate(Date pubDate){
        setPubDate(pubDate);
        return this;
    }
}

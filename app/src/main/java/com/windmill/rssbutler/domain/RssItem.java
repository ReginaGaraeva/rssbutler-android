package com.windmill.rssbutler.domain;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Date;

@Root(name = "item")
public class RssItem extends Entity {
    private Channel channel;

    @Element(required = false)
    private String title;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private String link;

    @Element(required = false)
    private String pubDate;

    public RssItem(long id, Channel channel) {
        this.id = id;
        this.channel = channel;
    }

    public RssItem() {
    }

    public RssItem(Channel channel) {
        this(UNKNOWN_ID, channel);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }
    //   public void setPubDate(Date pubDate){
//        this.pubDate = pubDate;
//    }
//
//    public Date getPubDate(){
//        return pubDate;
//    }
//

    public RssItem withTitle(String title) {
        setTitle(title);
        return this;
    }

    public RssItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    public RssItem inChannel(Channel channel) {
        setChannel(channel);
        return this;
    }

    public RssItem fromLink(String link) {
        setLink(link);
        return this;
    }

    public RssItem withPubDate(Date pubDate) {
        //setPubDate(pubDate);
        return this;
    }
}

package com.windmill.rssbutler.domain;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "channel")
@DatabaseTable(tableName = "channels")
public class Channel extends Entity {

    @Element
    @DatabaseField()
    private String title;

    @Element
    @DatabaseField
    private String description;

    @Element
    @DatabaseField
    private String link;

    @Element(required = false)
    private RssItem item;

    public Channel(String title, String link) {
        this(UNKNOWN_ID, title, link);
    }

    public Channel(int id, String title, String link) {
        this.id = id;
        setTitle(title);
        setLink(link);
    }

    protected Channel() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
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

    public Channel withTitle(String title) {
        setTitle(title);
        return this;
    }

    public Channel withDescription(String description) {
        setDescription(description);
        return this;
    }

    public Channel fromLink(String link) {
        setLink(link);
        return this;
    }
}

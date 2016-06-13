package com.windmill.rssbutler.domain;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "rss")
public class RssFeed {
    @Element
    private Channel channel;
}

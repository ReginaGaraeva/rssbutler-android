package com.windmill.rssbutler;

import android.util.Log;
import com.windmill.rssbutler.domain.Channel;
import com.windmill.rssbutler.domain.RssFeed;
import org.simpleframework.xml.core.Persister;

import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

public class RssParser {
    public RssFeed parse(String data) {
        Reader reader = new StringReader(data);
        Persister serializer = new Persister();
        RssFeed feed = null;
        try {
            feed = serializer.read(RssFeed.class, reader, false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return feed;
    }
}

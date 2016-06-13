package com.windmill.rssbutler;

import com.windmill.rssbutler.domain.Channel;

import java.util.Arrays;
import java.util.List;

public class PlainTextReader {
    public List<Channel> read(String filename) {
        return Arrays.asList(new Channel("NASA Breaking News", "https://www.nasa.gov/rss/dyn/breaking_news.rss"),
                new Channel("NASA Education News", "https://www.nasa.gov/rss/dyn/educationnews.rss"),
                new Channel("NASA Image Of The Day", "https://www.nasa.gov/rss/dyn/lg_image_of_the_day.rss"));
    }
}

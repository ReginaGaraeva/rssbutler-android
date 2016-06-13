package com.windmill.rssbutler.test;

import com.windmill.rssbutler.PlainTextReader;
import com.windmill.rssbutler.domain.Channel;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PlainTextReaderTest {
    private PlainTextReader reader;

    @Before
    public void setUp() throws Exception {
        reader = new PlainTextReader();
    }

    @Test
    public void read_returns_stubbing_Channels(){
        List<Channel> channels = reader.read("smth");

        assertThat(channels.size(), is(3));
        assertThat(channels.get(0).getLink(), is("https://www.nasa.gov/rss/dyn/breaking_news.rss"));
        assertThat(channels.get(1).getLink(), is("https://www.nasa.gov/rss/dyn/educationnews.rss"));
        assertThat(channels.get(2).getLink(), is("https://www.nasa.gov/rss/dyn/lg_image_of_the_day.rss"));
    }

}
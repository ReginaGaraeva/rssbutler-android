package com.windmill.rssbutler;

import android.util.Log;
import com.windmill.rssbutler.domain.Channel;
import com.windmill.rssbutler.domain.RssFeed;
import com.windmill.rssbutler.domain.RssItem;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RssParserTest {
    private static final String XML_STRING = "<?xml version=\"1.0\" encoding=\"utf-8\" ?><rss>\n" +
            "<channel>\n" +
            "    <title>Solar System and Beyond</title>\n" +
            "    <description>A RSS news feed containing the latest NASA press releases on missions exploring our solar system\n" +
            "        and beyond.\n" +
            "    </description>\n" +
            "    <link>http://www.nasa.gov/</link>\n" +
            "    <item>\n" +
            "        <title>Microscopic &quot;Timers&quot; Reveal Likely Source of Galactic Space Radiation</title>\n" +
            "        <link>http://www.nasa.gov/press-release/goddard/2016/ace-cosmic-ray</link>\n" +
            "        <description>Most of the cosmic rays that we detect at Earth originated relatively recently in nearby\n" +
            "            clusters of massive stars, according to new results from NASA&#039;s Advanced Composition Explorer (ACE)\n" +
            "            spacecraft.\n" +
            "        </description>\n" +
            "        <enclosure\n" +
            "                url=\"http://www.nasa.gov/sites/default/files/styles/1x1_cardfeed/public/thumbnails/image/hubble-ob-association.jpg?itok=A4zPTqOU\"\n" +
            "                length=\"1716407\" type=\"image/jpeg\"/>\n" +
            "        <guid isPermaLink=\"false\">http://www.nasa.gov/press-release/goddard/2016/ace-cosmic-ray</guid>\n" +
            "        <pubDate>Thu, 21 Apr 2016 14:00 EDT</pubDate>\n" +
            "        <source url=\"http://www.nasa.gov/rss/dyn/solar_system.rss\">Solar System and Beyond</source>\n" +
            "    </item>\n" +
            "</channel></rss>";


    private RssParser parser;

    @Before
    public void setUp(){
        parser = new RssParser();
    }
    
    @Test
    public void parse_parses_string_to_RssFeed() {
        RssFeed feed = parser.parse(XML_STRING);
        assertThat(1, is(2));
    }
}

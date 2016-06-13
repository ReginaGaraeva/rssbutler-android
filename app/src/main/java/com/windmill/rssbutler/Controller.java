package com.windmill.rssbutler;

public class Controller {
    private final MainFactory factory;

    public Controller(MainFactory factory){
        this.factory = factory;
    }

    public void init() {
        RssFeedController feed = new RssFeedController();
        feed.execute();
    }
}

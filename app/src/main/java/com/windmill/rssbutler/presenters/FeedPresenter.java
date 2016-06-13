package com.windmill.rssbutler.presenters;

import android.widget.ListView;
import com.windmill.rssbutler.FeedAdapter;
import com.windmill.rssbutler.MainFactory;
import com.windmill.rssbutler.db.Repository;
import com.windmill.rssbutler.domain.RssItem;

public class FeedPresenter {
    private ListView feed;
    private FeedAdapter adapter;
    private Repository<RssItem> newsRepo;

    public FeedPresenter(ListView feed, MainFactory factory) {
        this.feed = feed;
        this.adapter = factory.newFeedAdapter();
        this.newsRepo = factory.getNewsRepository();

        feed.setAdapter(adapter);
        set();
    }

    private void set() {
        adapter.set(this.newsRepo.select());
    }
}

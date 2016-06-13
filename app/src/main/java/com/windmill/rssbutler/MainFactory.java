package com.windmill.rssbutler;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.ListView;
import com.windmill.rssbutler.db.DaoRepository;
import com.windmill.rssbutler.db.ORMLiteDbHelper;
import com.windmill.rssbutler.db.Repository;
import com.windmill.rssbutler.domain.Channel;
import com.windmill.rssbutler.domain.RssItem;
import com.windmill.rssbutler.presenters.*;

import java.util.Arrays;
import java.util.List;

public class MainFactory {
    private final LayoutInflater inflater;
    private Context context;
    private DaoRepository<Channel> channelsRepository;
    private Controller controller;

    public MainFactory(Context context, LayoutInflater inflater) {
        this.context = context;
        this.inflater = inflater;
        this.controller = new Controller(this);
        this.controller.init();

        channelsRepository = new DaoRepository<>(Channel.class, new ORMLiteDbHelper(newPlainTextReader(), context));
    }

    private PlainTextReader newPlainTextReader() {
        return new PlainTextReader();
    }

    public Context getContext() {
        return context;
    }

    public LayoutInflater getInflater() {
        return inflater;
    }

    public DrawerPresenter newDrawerPresenter(DrawerLayout layout) {
        return new DrawerPresenter(layout, this);
    }

    public ChannelPresenter newChannelPresenter(Channel channel) {
        return new ChannelPresenter(this);
    }

    public DaoRepository getChannelsRepository() {
        return channelsRepository;
    }

    public Dialog newDialog() {
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }

    public ChannelEditPresenter newChannelEditPresenter() {
        return new ChannelEditPresenter(this);
    }

    public Controller getController() {
        return controller;
    }

    public RssItemPresenter newRssItemPresenter(RssItem rssItem) {
        return new RssItemPresenter(rssItem, this);
    }

    public FeedAdapter newFeedAdapter() {
        return new FeedAdapter(this);
    }

    public FeedPresenter newFeedPresenter(ListView feed) {
        return new FeedPresenter(feed, this);
    }

    public Repository<RssItem> getNewsRepository() {
        return new Repository<RssItem>() {
            @Override
            public List<RssItem> select() {
                Channel ch1 = new Channel("channel1-title", "channel1-link");
                Channel ch2 = new Channel("channel2-title", "channel2-link");
                RssItem it1 = new RssItem(ch1);
                RssItem it2 = new RssItem(ch2);
                RssItem it3 = new RssItem(ch2);
                it1.setDescription("rss item 1 description rss item 1 description rss item 1 description rss item 1 description rss item 1 description rss item 1 description rss item 1 description rss item 1 description.");
                it2.setDescription("rss item 2 description rss item 2 description rss item 2 description rss item 2 description rss item 2 description rss item 2 description rss item 2 description rss item 2 description.");
                it3.setDescription("rss item 3 description rss item 3 description rss item 3 description rss item 3 description rss item 3 description rss item 3 description rss item 3 description rss item 3 description.");
                return Arrays.asList(it1, it2, it3);
            }

            @Override
            public void delete(RssItem entity) {

            }

            @Override
            public void update(RssItem entity) {

            }

            @Override
            public void insert(RssItem entity) {

            }
        };
    }
}

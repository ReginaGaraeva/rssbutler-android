package com.windmill.rssbutler;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.windmill.rssbutler.domain.RssItem;

import java.util.ArrayList;
import java.util.List;

public class FeedAdapter extends BaseAdapter {
    private List<RssItem> items;
    private final MainFactory factory;

    public FeedAdapter(MainFactory factory) {
        this.factory = factory;
        this.items = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        RssItem rssItem = items.get(position);
        return factory.newRssItemPresenter(rssItem).getView();
    }

    public void set(List<RssItem> items) {
        this.items.addAll(items);
    }
}

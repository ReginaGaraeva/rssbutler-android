package com.windmill.rssbutler;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.windmill.rssbutler.domain.Channel;
import com.windmill.rssbutler.presenters.ChannelPresenter;

import java.util.List;

public class ChannelsAdapter extends BaseAdapter {
    private List<Channel> channels;
    private final MainFactory factory;

    public ChannelsAdapter(MainFactory factory){
        this.factory = factory;
    }

    @Override
    public int getCount() {
        return channels.size();
    }

    @Override
    public Object getItem(int position) {
        return channels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return channels.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Channel channel = channels.get(position);
        return factory.newChannelPresenter(channel).getView();
    }
}

package com.windmill.rssbutler;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;

import com.windmill.rssbutler.domain.Channel;
import com.windmill.rssbutler.presenters.ChannelPresenter;
import com.windmill.rssbutler.presenters.DrawerPresenter;

import java.util.zip.Inflater;

public class MainFactory {
    private final LayoutInflater inflater;
    private Context context;

    public MainFactory(Context context, LayoutInflater inflater) {
        this.context = context;
        this.inflater = inflater;
    }

    public Context getContext() {
        return context;
    }

    public LayoutInflater getInflater() {
        return inflater;
    }

    public DrawerPresenter newDrawerPresenter(DrawerLayout layout) {
        return new DrawerPresenter(layout);
    }

    public ChannelPresenter newChannelPresenter(Channel channel) {
        return new ChannelPresenter(this);
    }
}

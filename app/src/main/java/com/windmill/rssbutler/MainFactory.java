package com.windmill.rssbutler;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;

import com.windmill.rssbutler.presenters.DrawerPresenter;

public class MainFactory {
    private Context context;

    public MainFactory(Context context){
        this.context = context;
    }

    public Context getContext(){
        return context;
    }

    public DrawerPresenter newDrawerPresenter(DrawerLayout layout){
        return new DrawerPresenter(layout);
    }
}

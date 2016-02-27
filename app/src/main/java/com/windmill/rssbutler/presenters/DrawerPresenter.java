package com.windmill.rssbutler.presenters;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ListView;

import com.windmill.rssbutler.R;

import butterknife.InjectView;

public class DrawerPresenter {
    @InjectView(R.id.channels_list_listview)
    protected ListView channels;

    @InjectView(R.id.add_channel_button)
    protected ListView addChannel;

    public DrawerPresenter(DrawerLayout layout){
        layout.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(View drawerView) {

            }

            @Override
            public void onDrawerClosed(View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }

}

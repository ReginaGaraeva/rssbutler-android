package com.windmill.rssbutler.presenters;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.windmill.rssbutler.MainFactory;
import com.windmill.rssbutler.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class DrawerPresenter {
    private MainFactory factory;

    @InjectView(R.id.channels_list_listview)
    protected ListView channels;

    @InjectView(R.id.add_channel_button)
    protected Button addChannel;

    public DrawerPresenter(DrawerLayout layout, MainFactory factory){
        this.factory = factory;

        View view = factory.getInflater().inflate(R.layout.drawer, null);
        ButterKnife.inject(this, layout);

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

    @OnClick(R.id.add_channel_button)
    public void addChannel(){
        factory.newChannelEditPresenter();
    }

}

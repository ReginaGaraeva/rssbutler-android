package com.windmill.rssbutler;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        MainFactory factory = new MainFactory(this, getLayoutInflater());
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ListView feed = (ListView) findViewById(R.id.feed_list_view);

        factory.newDrawerPresenter(drawer);
        factory.newFeedPresenter(feed);
    }
}

package com.windmill.rssbutler.presenters;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.j256.ormlite.table.ObjectFactory;
import com.windmill.rssbutler.MainFactory;
import com.windmill.rssbutler.R;
import com.windmill.rssbutler.domain.RssItem;

public class RssItemPresenter {
    private RssItem rssItem;
    private View view;

    @InjectView(R.id.item_text)
    protected TextView text;

    @InjectView(R.id.item_channel)
    protected TextView channel;

    public RssItemPresenter(RssItem rssItem, MainFactory factory) {
        this.rssItem = rssItem;
        view = factory.getInflater().inflate(R.layout.rss_item, null);

        ButterKnife.inject(this, view);

        channel.setText(rssItem.getChannel().getTitle());
        text.setText(rssItem.getDescription());

    }

    public View getView() {
        return view;
    }
}

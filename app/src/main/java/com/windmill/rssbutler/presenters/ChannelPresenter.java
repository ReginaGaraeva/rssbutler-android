package com.windmill.rssbutler.presenters;

import android.view.View;
import android.widget.TextView;

import com.windmill.rssbutler.MainFactory;
import com.windmill.rssbutler.R;
import com.windmill.rssbutler.db.DaoRepository;
import com.windmill.rssbutler.domain.Channel;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ChannelPresenter {
    private final DaoRepository repository;

    private Channel channel;
    private View view;

    @InjectView(R.id.channel_title_textview)
    protected TextView title;

    public ChannelPresenter(MainFactory factory){
        this.repository = factory.getChannelsRepository();
        this.view = factory.getInflater().inflate(R.layout.channel, null);

        ButterKnife.inject(this, view);
    }

    public void set(Channel channel){
        this.channel = channel;

        title.setText(channel.getTitle());
    }

    public View getView(){
        return view;
    }
}

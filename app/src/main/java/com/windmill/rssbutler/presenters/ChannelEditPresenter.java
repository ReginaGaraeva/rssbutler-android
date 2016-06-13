package com.windmill.rssbutler.presenters;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;

import butterknife.OnClick;
import com.windmill.rssbutler.Controller;
import com.windmill.rssbutler.MainFactory;
import com.windmill.rssbutler.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import com.windmill.rssbutler.domain.Channel;

public class ChannelEditPresenter {
    private MainFactory factory;
    private Dialog dialog;
    private Controller controller;

    @InjectView(R.id.channel_save_button) protected Button save;
    @InjectView(R.id.channel_cancel_button) protected Button cancel;

    public ChannelEditPresenter(MainFactory factory){
        this.factory = factory;
        this.dialog = factory.newDialog();
        this.controller = factory.getController();

        View view = factory.getInflater().inflate(R.layout.channel_dialog, null);
        dialog = factory.newDialog();
        dialog.setContentView(view);

        ButterKnife.inject(this, view);

        dialog.show();
    }

//    @OnClick
//    public void save(){
//        //controller.save(new Channel());
//    }


}

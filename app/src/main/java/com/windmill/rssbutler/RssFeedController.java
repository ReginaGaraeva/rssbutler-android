package com.windmill.rssbutler;

import android.os.AsyncTask;
import android.util.Log;
import com.windmill.rssbutler.db.DaoRepository;
import com.windmill.rssbutler.domain.Channel;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RssFeedController extends AsyncTask<Void, Void, String> {
    private final String EXAMPLE_ADDRESS = "https://habrahabr.ru/rss/feed/posts/33e4cade2b3b281fcd6534a6198baaa0/";

    private DaoRepository<Channel> repository;

    public RssFeedController() {
    }

    @Override
    protected String doInBackground(Void... params) {
        init();
        return null;
    }


    public void init() {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(EXAMPLE_ADDRESS)
                .build();

        try {
            Response response = client.newCall(request).execute();
            String reply = response.body().string();
            Log.i("REPLY", reply);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

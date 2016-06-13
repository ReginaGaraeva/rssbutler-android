package com.windmill.rssbutler.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.windmill.rssbutler.PlainTextReader;
import com.windmill.rssbutler.domain.Channel;

import java.sql.SQLException;
import java.util.List;

public class ORMLiteDbHelper extends OrmLiteSqliteOpenHelper {
    private static final String TAG = "DB";
    private static final String DATABASE_NAME = "rssbutler";
    private static final int VERSION = 1;
    private static final String LINK = "link";
    private PlainTextReader reader;

    public ORMLiteDbHelper(PlainTextReader reader, Context context){
        super(context, DATABASE_NAME, null, VERSION);
        this.reader = reader;
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        try {
            final String CHANNELS = "channels";
            Log.d(TAG, "DB create");
            TableUtils.createTable(connectionSource, Channel.class);
            Log.d(TAG, "DB create");
            List<Channel> channels = reader.read("channels.txt");
            for (Channel channel : channels) {
                ContentValues values = new ContentValues();
                values.put(LINK, channel.getLink());
                db.insert(CHANNELS, null, values);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Can not create table 'channels': " + e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {

    }
}

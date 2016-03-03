package com.windmill.rssbutler.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.windmill.rssbutler.domain.Channel;

import java.sql.SQLException;

public class ORMLiteDbHelper extends OrmLiteSqliteOpenHelper {
    private static final String TAG = "DB";
    private static final String DATABASE_NAME = "rssbutler";
    private static final int VERSION = 1;

    public ORMLiteDbHelper(Context context){
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            Log.d(TAG, "DB create");
            TableUtils.createTable(connectionSource, Channel.class);
            Log.d(TAG, "DB create");
        } catch (SQLException e) {
            new RuntimeException("Can not create table 'channels': " + e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {

    }
}

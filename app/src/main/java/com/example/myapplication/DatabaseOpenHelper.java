package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "tessst.db";
    private static final int DATABASE_VERSION=1;

    public DatabaseOpenHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }



}

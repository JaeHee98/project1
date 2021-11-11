package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    /*데이터베이스 영역 따로 xml 필요없음.(subactivity구역 아님)*/
    static final String DATABASE_NAME = "test.db";
    private static final int DATABASE_VERSION =1;
    //static final int DATABASE_VERSION = 2;



    public DBHelper(Context context, int version) {
        super(context, DATABASE_NAME, null, version);
    }
    /*
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
*/

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE tableName ( name TEXT, info TEXT, na TEXT, kcal TEXT, tan TEXT, dan TEXT, gi TEXT, dang TEXT);");
        //, na TEXT, kcal TEXT, tan TEXT, dan TEXT, gi TEXT, dang TEXT
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tableName");
        onCreate(db);
    }


}

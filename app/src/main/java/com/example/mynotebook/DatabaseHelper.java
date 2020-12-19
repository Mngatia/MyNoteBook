package com.example.mynotebook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Spannable;

public class DatabaseHelper extends SQLiteOpenHelper{

    //Table name
    public static final String TABLE_NAME = "COUNTRIES";

    //Table Columns:
    public static final String _ID = "_id";
    public static final String SUBJECT = "subject";
    public static final String DESC = "description";

    //Database Information
    static final String DB_NAME = "MASTER_ANDROID_APP.DB";

    //Database Version:
    static final int DB_VERSION = 1;

    //Creating Table Query:
    private static final String CREATE_TABLE = "create table " +
            TABLE_NAME +"(" + _ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, " + SUBJECT +
            " TEXT NOT NULL, " + DESC + " TEXT); ";
    //end of SQL section

    //Constructor:
    public DatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate (SQLiteDatabase db) {
        //Executing the Query
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}

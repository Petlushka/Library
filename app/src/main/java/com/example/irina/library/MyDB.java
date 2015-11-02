package com.example.irina.library;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Irina on 01.11.2015.
 */
public class MyDB extends SQLiteOpenHelper {

    public MyDB(Context context) {
        super(context, "myDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE categories ("
        + "id integer primary key autoincrement,"
        + "name text");

        db.execSQL("CREATE TABLE Autors ("
        + "id integer primary key autoincrement, "
        + "name text");

        db.execSQL("CREATE TABLE Books ("
        + "id integer primary key autiincrement, "
        + "name text"
        + "category_id REFERENCES categories(_id)"
        + "autor_id REFERENCES autors(_id)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

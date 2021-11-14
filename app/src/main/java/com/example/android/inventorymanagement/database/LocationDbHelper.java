package com.example.android.inventorymanagement.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.inventorymanagement.database.StorageContract.StorageEntry;

public class LocationDbHelper extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "inventory.db";

    public LocationDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + StorageContract.StorageEntry.TABLE_NAME + " ("
                        + StorageContract.StorageEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + StorageContract.StorageEntry.LOCATION_NAME + " TEXT NOT NULL, "
                        + StorageContract.StorageEntry.FURNITURE + " TEXT , "
                        + StorageContract.StorageEntry.INLABEL + " TEXT, "
                        + StorageContract.StorageEntry.IMAGE + " BLOB, "
                        + StorageContract.StorageEntry.INPOSITION + " TEXT);";
        db.execSQL(SQL_CREATE_ENTRIES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}

package com.example.android.inventorymanagement.database;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import  com.example.android.inventorymanagement.database.StorageContract.StorageEntry;

public class LocationProvider extends ContentProvider{

    public static final String LOG_TAG = InventoryProvider.class.getSimpleName();
    private static final int INVENTORY = 100;
    private static final int INVENTORY_ID = 101;
    private static final UriMatcher sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    static  {
        sUriMatcher.addURI(StorageContract.CONTENT_AUTHORITY, StorageContract.PATH_INVENTORY, INVENTORY);
        sUriMatcher.addURI(StorageContract.CONTENT_AUTHORITY, StorageContract.PATH_INVENTORY + "/#", INVENTORY_ID);
    }

    private InventoryDbHelper inventoryDbHelper;
    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings1, @Nullable String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }
}

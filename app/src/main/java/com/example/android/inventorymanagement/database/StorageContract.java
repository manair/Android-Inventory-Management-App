package com.example.android.inventorymanagement.database;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public class StorageContract {

    public static final String CONTENT_AUTHORITY = "com.example.android.inventorymanagement";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_INVENTORY = "inventorymanagement";

    private StorageContract(){

    }

    public static  final class StorageEntry implements BaseColumns{
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORY;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENTORY;
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_INVENTORY);
        public static final String TABLE_NAME = "storage";
        public static final String _ID = BaseColumns._ID;
        public static final String LOCATION_NAME = "room";
        public static final String FURNITURE = "furniture";
        public static final String INLABEL = "inlabel";
        public static final String INPOSITION = "inposition";
        public static final String IMAGE = "image";
    }
}

package com.praticelogin.bigkbear.timetabling;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by BigKBear on 7/28/15.
 */
public class SQLiteDatabaseHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "school.db";

    private static final String TABLE_NAME = "profiles";

    private static final String COLUMN_PROFILES_ID = "profiles_id";
    private static final String COLUMN_FIRST_NAME = "first_name";
    private static final String COLUMN_MIDDLE_NAME = "middle_name";
    private static final String COLUMN_LAST_NAME = "last_name";
    private static final String COLUMN_ADDRESS = "address";
    private static final String COLUMN_HOUSE_NUMBER = "house_number";
    private static final String COLUMN_CELL_NUMBER = "cell_number";
    private static final String COLUMN_GENDER = "gender";
    private static final String COLUMN_ROLE_ROLE_ID = "role_role_id";
    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_PASSWORD = "password";

    private static final String TABLE_CREATE = "create table " +
            TABLE_NAME +" (profiles_id integer primary key not null auto_increment , " +
            "first_name text not null , middle_name text not null , last_name text not null , address text not null , house_number text not null , cell_number text not null , gender text not null , role_role_id text not null , username text not null , password text not null);";

    public SQLiteDatabaseHelper(Context context)
    {
        super(context , DATABASE_NAME , null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}

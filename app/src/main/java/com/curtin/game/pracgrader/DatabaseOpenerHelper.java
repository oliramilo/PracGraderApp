package com.curtin.game.pracgrader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.curtin.game.pracgrader.Database.MarksSchema;
import com.curtin.game.pracgrader.Database.UserSchema;

public class DatabaseOpenerHelper extends SQLiteOpenHelper {
    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "pracgrader.db";
    public DatabaseOpenerHelper(Context context) {
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(UserSchema.UserTable.CREATE_TABLE);
        sqLiteDatabase.execSQL(MarksSchema.MarksTable.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

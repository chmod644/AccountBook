package com.example.n.accountbook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BookOpenHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 0;

    public static final String DATABASE_NAME = "account_book.db";

    private static final String JOURNAL_TABLE_CREATE =
            "CREATE TABLE " + Journal.TABLE_NAME + "(" +
                    Journal._ID + " INTEGER PRIMARY KEY," +
                    Journal.COLUMN_INPUT_ID + " TEXT NOT NULL, " +
                    Journal.COLUMN_OUTPUT_ID + " TEXT NOT NULL, " +
                    Journal.COLUMN_AMOUNT + " INTEGER);";

    private static final String JOURNAL_TABLE_DELETE =
            "DROP TABLE IF EXISTS " + Journal.TABLE_NAME;

    public BookOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(JOURNAL_TABLE_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(JOURNAL_TABLE_DELETE);
        onCreate(db);
    }
}


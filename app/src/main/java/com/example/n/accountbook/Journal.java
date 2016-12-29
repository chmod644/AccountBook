package com.example.n.accountbook;

import android.provider.BaseColumns;

public class Journal implements BaseColumns {
    public static final String TABLE_NAME = "journal";

    public static final String COLUMN_INPUT_ID = "input_id";
    public static final String COLUMN_OUTPUT_ID = "output_id";
    public static final String COLUMN_AMOUNT = "amount";
}
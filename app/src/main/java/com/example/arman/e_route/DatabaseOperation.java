package com.example.arman.e_route;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DatabaseOperation extends SQLiteOpenHelper {

public static final int database_version = 1;

 public String CREATE_QUERY = "CREATE TABLE "+ TableData.TableInfo.TABLE_NAME+"("+TableData.TableInfo.NAME+" TEXT,"+ TableData.TableInfo.USER_NAME + " TEXT,"+ TableData.TableInfo.USER_PASS+" TEXT);";

    public DatabaseOperation(Context context ) {
        super(context, TableData.TableInfo.DATABASE_NAME, null, database_version);
        Log.d("Database operations","Database created");

    }

    @Override
    public void onCreate(SQLiteDatabase sdb) {
        sdb.execSQL(CREATE_QUERY);
        Log.d("Database operations","Table created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void putInformation(DatabaseOperation dop,String name1,String name,String pass)
    {
        SQLiteDatabase SQ = dop.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(TableData.TableInfo.NAME,name1);
        cv.put(TableData.TableInfo.USER_NAME,name);
        cv.put(TableData.TableInfo.USER_PASS,pass);
        long k= SQ.insert(TableData.TableInfo.TABLE_NAME,null,cv);
        Log.d("Database operations","One raw inserted");
    }

    public Cursor getInformation(DatabaseOperation dop)
    {
       SQLiteDatabase SQ = dop.getReadableDatabase();
        String[] coloumns = {TableData.TableInfo.NAME,TableData.TableInfo.USER_NAME, TableData.TableInfo.USER_PASS};
        Cursor CR = SQ.query(TableData.TableInfo.TABLE_NAME,coloumns,null,null,null,null,null);
        return CR;
    }
}

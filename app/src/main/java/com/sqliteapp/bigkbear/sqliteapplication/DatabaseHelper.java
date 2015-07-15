package com.sqliteapp.bigkbear.sqliteapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*
 * Created by BigKBear on 5/7/15.
 * Main class for handeling SQL lite
 * It contains two methods onCreate and onUpgrade
 * A default constructor was then created for the Database
 * Aim is to create below Database:
 * Database name Student.db
 * ID   Name        Surname     Marks
 * 1    Mark        Taylor      78
 * 2    Tom         Smith       89
 * 3    John        Mal         97
 * 4    Max         Nickson     90
 */
public class DatabaseHelper extends SQLiteOpenHelper    {
    //Declaration of Variables for student.db
    private static final String DATABASE_NAME = "application.db";
    private static final String Table_Name = "student_table";
    private static final String student_id = "ID";
    private static final String student_name = "Name";
    private static final String student_surname = "Surname";
    private static final String student_age = "Age";
    private static final String student_class = "class";
    private static final String student_subject = "Subject";
    private static final String student_assesment_type = "Assesment Type";
    private static final String student_gender = "Gender";
    private static final String student_username = "Username";
    private static final String student_password = "Password";

    //Declaration of Variables for parent.db
    //private static final String DATABASE_NAME = "parent.db";
    private static final String Table_Name = "parent_table";
    private static final String parent_id = "ID";
    private static final String parent_name = "Name";
    private static final String parent_address = "Address";
    private static final String parent_age = "Username";
    private static final String parent_password = "Password";
    private static final String parent_telephone_number = "Telephone Number";
    private static final String parent_cellphone_number = "Cellphone Number";
    private static final String parent_gender = "Gender";
    
    private static final int DATABASE_VERSION=1;

    //Complecated database Constructor
    //public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    //Simple Database constructor
    public DatabaseHelper(Context context){
        //a function call to create the database when ever this function is called a database would be created
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        /*Check that the database and table is created by adding this line
        SQLiteDatabase db = this.getWritableDatabase();
        */
    }

//Database Functions
    /*this is called when the database is created for the first time. Creation of tables and initial data is placed in this function.*/
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table_Name + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, Name TEXT, Surname TEXT, Marks INTEGER)");//executes what ever queary you pass and creates a table

    }

    /*This method is called when the database needs to be upgraded. This method is used to drop tables, add tables, or do anything else it needs to upgrade to the new schema version.*/
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + Table_Name);
        onCreate(db);
    }

    //new method to create data
    public boolean insertData ( String name, String surname, String marks) {
        //create the instance of the SQL lite data base
        SQLiteDatabase db = this.getWritableDatabase();
        //creation of a class called Content value
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, name);
        contentValues.put(COl_3, surname);
        contentValues.put(COL_4, marks);

        //If an exception occurs the insert function returns -1 and stores it in the result variable just created
        long result = db.insert(Table_Name,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData(){
        //query to get all data
        //step one create and instance of the SQL lite data base
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from" +Table_Name, null);
        return res;

    }
}

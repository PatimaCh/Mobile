package com.example.csitgis.lab6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Student {
    public static final String TABLE_NAME = "students";

    public static final String COLUMN_ID = "std_id";
    public static final String COLUMN_NAME = "std_name";

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public static String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " TEXT, "
                    + COLUMN_NAME + " TEXT, "
                    + ")";

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student getStudent(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(Student.TABLE_NAME,
                new String[] {Student.COLUMN_ID, Student.COLUMN_NAME},
                Student.COLUMN_ID + "=?",
                new String[] {String.valueOf(id)}, null, null, null, null);

        if (cursor != null){
            cursor.moveToFirst();
        }
        Student student = new Student(
                cursor.getString(cursor.getColumnIndex(Student.COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(Student.COLUMN_NAME));

        cursor.close();
        return student;
        )
    }

    public Student() {

    }
}

package com.nassim.students_courses_manager.data;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.nassim.students_courses_manager.data.entities.Course;
import com.nassim.students_courses_manager.data.entities.CourseDao;
import com.nassim.students_courses_manager.data.entities.ScheduleDao;
import com.nassim.students_courses_manager.data.entities.ScheduleItem;

@Database(entities = {Course.class, ScheduleItem.class}, version = 1)
public abstract class StudentDb extends RoomDatabase {

    private static StudentDb instance;

    public static StudentDb getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            StudentDb.class, "app_database")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    public abstract CourseDao courseDao();
    public abstract ScheduleDao scheduleDao();
}

package com.nassim.students_courses_manager.data.repositories;


import android.annotation.SuppressLint;
import android.content.Context;
import com.nassim.students_courses_manager.data.StudentDb;
import com.nassim.students_courses_manager.data.entities.Course;
import com.nassim.students_courses_manager.data.entities.ScheduleItem;
import java.util.List;
import io.reactivex.Observable;


public class StudentRepository {

    private final StudentDb db;

    public StudentRepository(Context context) {
        this.db =  StudentDb.getInstance(context);
    }

    //Course
    public Observable<List<Course>> getCourses() {
        return db.courseDao().getAll();
    }

    public void addCourse(Course course) {
        db.courseDao().insert(course);
    }

    public void deleteCourse(Course course) {
        db.courseDao().delete(course);
    }

    //Schedule
    public Observable<List<ScheduleItem>> getSchedule() {
        return db.scheduleDao().getAll();
    }

    public void addScheduleItem(ScheduleItem scheduleItem) {
        db.scheduleDao().insert(scheduleItem);
    }

    public void deleteScheduleItem(ScheduleItem scheduleItem) {
        db.scheduleDao().delete(scheduleItem);
    }
}

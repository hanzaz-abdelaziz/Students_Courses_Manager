package com.nassim.students_courses_manager.data.entities;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;


import java.util.List;

import io.reactivex.Observable;

@Dao
public interface CourseDao {
    @Insert
    void insert(Course course);

    @Delete
    void delete(Course course);

    @Query("SELECT * FROM courses")
    Observable<List<Course>> getAll();
}
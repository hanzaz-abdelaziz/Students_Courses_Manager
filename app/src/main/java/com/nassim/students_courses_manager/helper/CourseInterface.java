package com.nassim.students_courses_manager.helper;


import com.nassim.students_courses_manager.data.entities.Course;

import java.util.List;

import io.reactivex.Observable;

public interface CourseInterface {

    void insert(Course course);

    
    void delete(Course course);

    Observable<List<Course>> getAll();
}

package com.nassim.students_courses_manager.ui;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.nassim.students_courses_manager.data.repositories.StudentRepository;

public class StudentViewModel extends AndroidViewModel {

    private final StudentRepository studentRepository;

    public StudentViewModel(@NonNull Application application) {
        super(application);
        this.studentRepository = new StudentRepository(application);
    }


}

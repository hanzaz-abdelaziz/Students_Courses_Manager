package com.nassim.students_courses_manager.data.entities;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;


import java.util.List;

import io.reactivex.Observable;

@Dao
public interface ScheduleDao {
    @Insert
    void insert(ScheduleItem scheduleItem);

    @Delete
    void delete(ScheduleItem scheduleItem);

    @Query("SELECT * FROM schedule_item")
    Observable<List<ScheduleItem>> getAll();
}
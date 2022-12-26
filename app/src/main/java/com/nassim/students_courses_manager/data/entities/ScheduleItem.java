package com.nassim.students_courses_manager.data.entities;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;

@Entity(tableName = "schedule_item")
@TypeConverters(DateTypeConverter.class)
public class ScheduleItem {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private Course course;
    @ColumnInfo(name = "start_time")
    private Date startTime;
    @ColumnInfo(name = "end_time")
    private Date endTime;

    // Add getters and setters for the fields
}
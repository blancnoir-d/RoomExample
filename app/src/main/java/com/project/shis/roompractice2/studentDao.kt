package com.project.shis.roompractice2

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface studentDao{
    @Query("SELECT * FROM studentTbl")
    fun allStudents():List<Student>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(student:Student)
}
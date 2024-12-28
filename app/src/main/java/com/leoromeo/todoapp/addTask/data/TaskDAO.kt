package com.leoromeo.todoapp.addTask.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface TaskDAO{
   @Query("SELECT  * FROM TaskEntity")
   fun getTasks():Flow<List<TaskEntity>>

   @Insert
   suspend fun addTask(itme:TaskEntity)
}
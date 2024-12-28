package com.leoromeo.todoapp.addTask.data

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val task: String,
    val selected: Boolean = false
)
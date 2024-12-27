package com.leoromeo.todoapp.addTask.data

import androidx.room.PrimaryKey

data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val task: String,
    val selected: Boolean = false
)
package com.leoromeo.todoapp.addTask.ui.models

data class TaskData(
    val task: String,
    var selected: Boolean = false,
    val id: Long = System.currentTimeMillis()
)

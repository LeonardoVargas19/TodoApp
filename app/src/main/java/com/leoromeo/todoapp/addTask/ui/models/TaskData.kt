package com.leoromeo.todoapp.addTask.ui.models

data class TaskData(
    val id: Int = System.currentTimeMillis().hashCode(),
    val task: String,
    var selected: Boolean = false
)

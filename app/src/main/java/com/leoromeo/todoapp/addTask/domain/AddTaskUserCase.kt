package com.leoromeo.todoapp.addTask.domain

import com.leoromeo.todoapp.addTask.data.TaskRepository
import com.leoromeo.todoapp.addTask.ui.models.TaskData
import jakarta.inject.Inject

class AddTaskUserCase @Inject constructor(private val taskrepository: TaskRepository){
    suspend operator fun invoke(taskdata: TaskData){
        taskrepository.add(taskdata)
    }
}
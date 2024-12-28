package com.leoromeo.todoapp.addTask.data


import com.leoromeo.todoapp.addTask.ui.models.TaskData
import jakarta.inject.Inject
import jakarta.inject.Singleton
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

@Singleton
class TaskRepository @Inject constructor(private val taskDao: TaskDAO) {
    val tasks: Flow<List<TaskData>> = taskDao.getTasks().map { items ->
        items.map {
            println("ID: ${it.id}, Task: ${it.task}, Selected: ${it.selected}")
            TaskData(
                it.id,
                it.task,
                it.selected
            )
        }
    }


    suspend fun add(taskModel: TaskData) {
        taskDao.addTask(TaskEntity(taskModel.id, taskModel.task, taskModel.selected))
    }

}
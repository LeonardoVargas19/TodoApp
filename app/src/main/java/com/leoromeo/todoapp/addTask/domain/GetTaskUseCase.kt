package com.leoromeo.todoapp.addTask.domain

import com.leoromeo.todoapp.addTask.data.TaskRepository
import com.leoromeo.todoapp.addTask.ui.models.TaskData
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class GetTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskData>> = taskRepository.tasks

}
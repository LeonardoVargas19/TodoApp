package com.leoromeo.todoapp.addTask.ui

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leoromeo.todoapp.addTask.ui.models.TaskData
import javax.inject.Inject

class TaskViewModel @Inject constructor() : ViewModel() {

    private val _showDialog = MutableLiveData<Boolean>()
    var showDialog: LiveData<Boolean> = _showDialog

    private val _task = mutableStateListOf<TaskData>()
    val task: List<TaskData> = _task


    fun onDialogClose() {
        _showDialog.value = false
    }

    fun onTaskCreated(task: String) {
        _showDialog.value = false
        _task.add(TaskData(task = task))
    }

    fun onShowDialog() {
        _showDialog.value = true
    }

    fun onCheckBoxSelected(data: TaskData) {
        val index = _task.indexOf(data)
        _task[index] = _task[index].let {
            it.copy(selected = !it.selected)
        }
    }

    fun onItemRemove(data: TaskData) {
        val task = _task.find { it.id == data.id }
        _task.remove(task)
    }
}

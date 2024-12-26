package com.leoromeo.todoapp.addTask.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class TaskViewModel @Inject constructor() : ViewModel() {

    private val _showDialog = MutableLiveData<Boolean>()
    var showDialog: LiveData<Boolean> = _showDialog

    fun onDialogClose() {
        _showDialog.value = false
    }

    fun onTaskCreated(string: String) {
        _showDialog.value = false
        Log.i("TAG", "Rei ayanami piloto del eva 001: $string")
    }

    fun onShowDialog() {
        _showDialog.value = true
    }
}

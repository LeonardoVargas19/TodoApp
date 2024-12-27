package com.leoromeo.todoapp.addTask.data.di

import android.content.Context
import androidx.room.Room
import com.leoromeo.todoapp.addTask.data.TaskDAO
import com.leoromeo.todoapp.addTask.data.TodoDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {

    @Provides
    fun provideTaskDao(todoDataBase: TodoDataBase): TaskDAO {
        return todoDataBase.taskDao()
    }


    @Provides
    @Singleton
    fun providerTodoDatabase(@ApplicationContext appContext: Context): TodoDataBase {
        return Room.databaseBuilder(appContext, TodoDataBase::class.java, "TodoDataBase").build()
    }
}
package com.example.todovsn.data

import android.content.Context
import com.example.todovsn.data.preference.PreferenceRepository

interface AppContainer {
    val toDoRepository: ToDoRepository
    val userPreferencesRepository: PreferenceRepository
}

class AppDataContainer(private val context: Context) : AppContainer {
    /**
     * Implementation for [ToDoRepository]
     */
    override val toDoRepository: ToDoRepository by lazy {
        val database = ToDoDatabase.getDatabase(context)
        OfflineToDoRepository(database.toDoDao(), database.categoryDao())
    }

    override val userPreferencesRepository: PreferenceRepository by lazy {
        PreferenceRepository(context)
    }
}
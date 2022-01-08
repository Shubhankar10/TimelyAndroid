package com.example.timely

import android.app.Application

class NoteApplication: Application() {
    private val dataBase by lazy { NoteDataBase.getDatabase(this) }
    val repository by lazy { NoteRepository(dataBase.noteDao()) }
}
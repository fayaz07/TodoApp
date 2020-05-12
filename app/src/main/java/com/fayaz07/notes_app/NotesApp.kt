package com.fayaz07.notes_app

import android.app.Application
import com.androidnetworking.AndroidNetworking
import com.fayaz07.notes_app.db.NotesDatabase

class NotesApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AndroidNetworking.initialize(applicationContext)
    }

    fun getNotesDb(): NotesDatabase {
        return NotesDatabase.getInstance(this)
    }

}
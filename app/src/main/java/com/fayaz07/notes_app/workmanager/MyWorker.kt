package com.fayaz07.notes_app.workmanager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.fayaz07.notes_app.NotesApp

class MyWorker(val context: Context, workerParameters: WorkerParameters) : Worker(context, workerParameters) {
    override fun doWork(): Result {
        val notesApp = applicationContext as NotesApp
        val notesDao = notesApp.getNotesDb().notesDao()
        notesDao.deleteNotes(true)
        return Result.success()
    }

}
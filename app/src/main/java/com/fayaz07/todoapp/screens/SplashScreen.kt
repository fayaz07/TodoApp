package com.fayaz07.todoapp.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fayaz07.todoapp.R
import com.fayaz07.todoapp.data.Session

class SplashScreen : AppCompatActivity() {

    private lateinit var session: Session;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        session = Session(this);

        if (session.getLoggedIn()) {
            startActivity(Intent(this, TodoTasks::class.java));
        } else {
            startActivity(Intent(this, Login::class.java));
        }
        finish()
    }
}

package com.fayaz07.todoapp.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.fayaz07.todoapp.R
import com.fayaz07.todoapp.data.Session
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.view.*

class Login : AppCompatActivity() {

    private lateinit var session: Session;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        session = Session(this);
    }

    fun login(view: View) {
        val fullName = fullNameTF.editText?.text.toString()
        val username = usernameTF.editText?.text.toString()
        if (!fullName.isBlank() && !username.isBlank()) {
            startActivity(Intent(this, TodoTasks::class.java))
            session.setLoggedIn(true)
            session.setFullName(fullName)
            finish()
        } else {
            Toast.makeText(this, "Oops! You have not filled required fields", Toast.LENGTH_LONG).show()
        }
    }
}

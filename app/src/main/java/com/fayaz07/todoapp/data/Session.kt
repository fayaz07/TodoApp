package com.fayaz07.todoapp.data

import android.content.Context
import android.content.SharedPreferences

class Session(context: Context) {
    private var sharedPreferences: SharedPreferences =
        context.getSharedPreferences(Constants.SessionConstants.APP, Context.MODE_PRIVATE)

    private var editor: SharedPreferences.Editor = sharedPreferences.edit()

    fun setLoggedIn(loggedIn: Boolean) {
        editor.putBoolean(Constants.SessionConstants.LOGGED_IN, loggedIn ?: false)
        editor.commit()
    }

    fun getLoggedIn(): Boolean {
        return sharedPreferences.getBoolean(Constants.SessionConstants.LOGGED_IN, false)
    }

    fun setUsername(username: String) {
        editor.putString(Constants.SessionConstants.USERNAME, username ?: "user")
        editor.commit()
    }

    fun getUsername(): String {
        return sharedPreferences.getString(Constants.SessionConstants.USERNAME, "user") ?: "user"
    }

    fun setFullName(fullName: String) {
        editor.putString(Constants.SessionConstants.FULL_NAME, fullName ?: "user") ?: "user"
        editor.commit()
    }

    fun getFullName(): String {
        return sharedPreferences.getString(Constants.SessionConstants.USERNAME, "user") ?: "user"
    }


}
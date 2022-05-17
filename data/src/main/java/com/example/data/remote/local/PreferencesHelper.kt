package com.example.data.remote.local

import android.content.Context
import android.content.SharedPreferences

class PreferencesHelper(context: Context) {

    private val preferences: SharedPreferences =
        context.getSharedPreferences("prefs", Context.MODE_PRIVATE)

    var login: String
        get() = preferences.getString("login", "login")!!
        set(value) = preferences.edit().putString("login", value).apply()
    var password: String
        get() = preferences.getString("password", "password")!!
        set(value) = preferences.edit().putString("password", value).apply()
    var isAuthenticated
        get() = preferences.getBoolean("authorized", false)
        set(value) = preferences.edit().putBoolean("authorized", value).apply()
    var accessToken
        get() = preferences.getString("access_token", "access_token")
        set(value) = preferences.edit().putString("access_token", value).apply()
    var refreshToken
        get() = preferences.getString("refresh_token", "refresh_token")
        set(value) = preferences.edit().putString("refresh_token", value).apply()

}
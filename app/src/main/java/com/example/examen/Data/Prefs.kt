package com.example.examen.Data

import android.content.Context
import android.content.SharedPreferences

class Prefs (context: Context){
    val PREF_NAME ="sharedpreferences"
    val SHARED_NAME="shared_name"
    val SHARED_PASSWOR="shared_pass"
    val SHARED_TELEFONO="shared_telefono"
    val prefs: SharedPreferences = context.getSharedPreferences(PREF_NAME,0)

    var name: String?
        get() = prefs.getString(SHARED_NAME,"Fernando Negrete")
        set(value) = prefs.edit().putString(SHARED_NAME,value).apply()

    var password: String?
        get() = prefs.getString(SHARED_PASSWOR, "123456")
        set(value) = prefs.edit().putString(SHARED_PASSWOR, value).apply()

    var telefono: String?
        get() = prefs.getString(SHARED_TELEFONO, "54545859")
        set(value) = prefs.edit().putString(SHARED_TELEFONO, value).apply()

}
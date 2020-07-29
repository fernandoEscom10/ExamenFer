package com.example.examen

import android.app.Application
import com.example.examen.Data.Prefs

class SaredApp : Application(){
    companion object{
        lateinit var prefs: Prefs
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
    }
}
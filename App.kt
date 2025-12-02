package com.example.filmssearch3

import android.app.Application
import com.example.filmssearch3.di.AppComponent
import com.example.filmssearch3.di.DaggerAppComponent

class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.create()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}
package com.example.filmssearch3

import android.app.Application
import com.example.filmssearch3.di.AppComponent
import com.example.filmssearch3.di.DaggerAppComponent
import com.example.filmssearch3.di.modules.DatabaseModule
import com.example.filmssearch3.di.modules.DomainModule
import com.example.filmssearch3.di.modules.RemoteModule

class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        dagger = DaggerAppComponent.builder()
            .remoteModule(RemoteModule())
            .databaseModule(DatabaseModule())
            .domainModule(DomainModule(this))
            .build()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}
package com.example.filmssearch3

import android.app.Application
import com.example.filmssearch3.di.AppComponent
import com.example.filmssearch3.di.DaggerAppComponent
import com.example.filmssearch3.di.modules.DatabaseModule
import com.example.filmssearch3.di.modules.DomainModule
import com.example.remote_module.DaggerRemoteComponent

class App : Application() {
    lateinit var dagger: AppComponent

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Создаем компонент
        val remoteProvider = DaggerRemoteComponent.create()
        dagger = DaggerAppComponent.builder()
            .remoteProvider(remoteProvider)
            .databaseModule(DatabaseModule())
            .domainModule(DomainModule(this))
            .build()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}
package com.example.filmssearch3.di

import com.example.filmssearch3.di.modules.DatabaseModule
import com.example.filmssearch3.di.modules.DomainModule
import com.example.filmssearch3.di.modules.RemoteModule
import com.example.filmssearch3.viewmodel.HomeFragmentViewModel
import dagger.Component
import javax.inject.Singleton
import com.example.filmssearch3.viewmodel.SettingsFragmentViewModel


@Singleton
@Component(
    //Внедряем все модули, нужные для этого компонента
    modules = [
        RemoteModule::class,
        DatabaseModule::class,
        DomainModule::class
    ]
)
interface AppComponent {
    //метод для того, чтобы появилась возможность внедрять зависимости в HomeFragmentViewModel
    fun inject(homeFragmentViewModel: HomeFragmentViewModel)
    //метод для того, чтобы появилась возможность внедрять зависимости в SettingsFragmentViewModel
    fun inject(settingsFragmentViewModel: SettingsFragmentViewModel)
}
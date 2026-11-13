package com.example.filmssearch3.di


import com.example.filmssearch3.di.modules.DatabaseModule
import com.example.filmssearch3.di.modules.DomainModule
import com.example.filmssearch3.viewmodel.HomeFragmentViewModel
import com.example.filmssearch3.viewmodel.SettingsFragmentViewModel
import dagger.Component
import com.example.remote_module.RemoteProvider
import javax.inject.Singleton

@Singleton
@Component(
    //Внедряем все модули, нужные для этого компонента
    dependencies = [RemoteProvider::class],
    modules = [
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
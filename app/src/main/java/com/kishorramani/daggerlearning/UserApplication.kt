package com.kishorramani.daggerlearning

import android.app.Application
import com.kishorramani.daggerlearning.component.AppComponent
import com.kishorramani.daggerlearning.component.DaggerAppComponent

class UserApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()
    }
}
package com.kishorramani.daggerlearning

import android.app.Application
import com.kishorramani.daggerlearning.component.DaggerUserRegistrationComponent
import com.kishorramani.daggerlearning.component.UserRegistrationComponent

class UserApplication : Application() {

    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()

        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }
}
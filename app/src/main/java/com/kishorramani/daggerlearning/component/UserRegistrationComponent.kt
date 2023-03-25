package com.kishorramani.daggerlearning.component

import com.kishorramani.daggerlearning.MainActivity
import com.kishorramani.daggerlearning.modules.NotificationServiceModule
import com.kishorramani.daggerlearning.modules.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun mainInject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }
}
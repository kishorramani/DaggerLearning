package com.kishorramani.daggerlearning.component

import com.kishorramani.daggerlearning.EmailService
import com.kishorramani.daggerlearning.MainActivity
import com.kishorramani.daggerlearning.modules.NotificationServiceModule
import com.kishorramani.daggerlearning.modules.UserRepositoryModule
import com.kishorramani.daggerlearning.scopes.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun mainInject(mainActivity: MainActivity)

    fun getEmailService() : EmailService

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }
}
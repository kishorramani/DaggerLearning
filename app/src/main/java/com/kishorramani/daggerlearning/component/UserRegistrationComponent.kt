package com.kishorramani.daggerlearning.component

import com.kishorramani.daggerlearning.MainActivity
import com.kishorramani.daggerlearning.modules.NotificationServiceModule
import com.kishorramani.daggerlearning.modules.UserRepositoryModule
import com.kishorramani.daggerlearning.scopes.ActivityScope
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

//    @Subcomponent.Factory
//    interface Factory {
//        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
//    }
}
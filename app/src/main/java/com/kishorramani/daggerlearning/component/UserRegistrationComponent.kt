package com.kishorramani.daggerlearning.component

import com.kishorramani.daggerlearning.MainActivity
import com.kishorramani.daggerlearning.modules.NotificationServiceModule
import com.kishorramani.daggerlearning.modules.UserRepositoryModule
import com.kishorramani.daggerlearning.scopes.ActivityScope
import dagger.BindsInstance
import dagger.Component

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int, appComponent: AppComponent): UserRegistrationComponent
    }
}
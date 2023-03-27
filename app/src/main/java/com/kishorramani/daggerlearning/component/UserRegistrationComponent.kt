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

    // To use Component.Builder()
    // Define @Component.Builder
    // Create build method ---> return Component
    // Create runtime value assign method ---> return Builder

    //Builder
    /*@Component.Builder
    interface Builder {
        fun build() : UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int): Builder
    }*/

    @Component.Builder
    interface Builder {
        fun build(): UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int): Builder
        fun appComponent(appComponent: AppComponent): Builder
    }
}
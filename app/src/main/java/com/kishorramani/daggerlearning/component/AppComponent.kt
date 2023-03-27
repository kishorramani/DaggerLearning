package com.kishorramani.daggerlearning.component

import com.kishorramani.daggerlearning.analytics.AnalyticsService
import com.kishorramani.daggerlearning.modules.AnalyticsModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    //fun getUserRegistrationComponentFactory() : UserRegistrationComponent.Factory

    //Builder
    //fun getUserRegistrationComponentBuilder() : UserRegistrationComponent.Builder

    fun getAnalyticsService(): AnalyticsService
}
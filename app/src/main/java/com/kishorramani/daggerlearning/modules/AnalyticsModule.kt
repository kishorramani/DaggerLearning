package com.kishorramani.daggerlearning.modules

import com.kishorramani.daggerlearning.analytics.AnalyticsService
import com.kishorramani.daggerlearning.analytics.MixPanel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {

    @Singleton
    @Provides
    fun getAnalyticsService(): AnalyticsService {
        return MixPanel()
    }
}
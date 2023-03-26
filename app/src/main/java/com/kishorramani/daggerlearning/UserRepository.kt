package com.kishorramani.daggerlearning

import android.util.Log
import com.kishorramani.daggerlearning.analytics.AnalyticsService
import com.kishorramani.daggerlearning.scopes.ActivityScope
import com.kishorramani.daggerlearning.scopes.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ki- UserRepository"

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(TAG, "User saved in SQL DB")
        analyticsService.trackEvent("Save User", "Create")
    }
}

class FirebaseRepository(val analyticsService: AnalyticsService): UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(TAG, "User saved in Firebase DB")
        analyticsService.trackEvent("Save User", "Create")
    }

}
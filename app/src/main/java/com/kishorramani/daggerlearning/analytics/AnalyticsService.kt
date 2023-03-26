package com.kishorramani.daggerlearning.analytics

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ki- AnalyticsService"

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}

class MixPanel : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.e(TAG, "MixPanel: $eventName - $eventType")
    }
}

class FirebaseAnalytics : AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.e(TAG, "FirebaseAnalytics: $eventName - $eventType")
    }
}
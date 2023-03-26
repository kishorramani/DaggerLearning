package com.kishorramani.daggerlearning

import android.util.Log
import com.kishorramani.daggerlearning.scopes.ActivityScope
import com.kishorramani.daggerlearning.scopes.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ki- EmailService"

interface NotificationService {
    fun send(to: String, from: String, body: String)
}

@ActivityScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.e(TAG, "Email Send")
    }
}

class MessageService(private val retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.e(TAG, "Message Send - Retry count: $retryCount")
    }
}
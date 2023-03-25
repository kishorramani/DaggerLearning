package com.kishorramani.daggerlearning

import android.util.Log
import javax.inject.Inject

private const val TAG = "ki- EmailService"

interface NotificationService {
    fun send(to: String, from: String, body: String)
}

class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.e(TAG, "Email Send")
    }
}

class MessageService : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.e(TAG, "Message Send")
    }
}
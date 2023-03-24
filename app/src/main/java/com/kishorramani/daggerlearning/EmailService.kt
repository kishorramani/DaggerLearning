package com.kishorramani.daggerlearning

import android.util.Log

private const val TAG = "EmailService"

class EmailService {
    fun sendEmail(to: String, from: String, body: String) {
        Log.e(TAG, "Email Send")
    }
}
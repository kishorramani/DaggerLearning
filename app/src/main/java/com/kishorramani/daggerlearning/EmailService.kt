package com.kishorramani.daggerlearning

import android.util.Log
import javax.inject.Inject

private const val TAG = "EmailService"

class EmailService @Inject constructor() {
    fun sendEmail(to: String, from: String, body: String) {
        Log.e(TAG, "Email Send")
    }
}
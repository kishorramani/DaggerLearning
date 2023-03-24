package com.kishorramani.daggerlearning

import android.util.Log

private const val TAG = "UserRepository"

class UserRepository {
    fun saveUser(email: String, password: String) {
        Log.e(TAG, "User saved in DB")
    }
}
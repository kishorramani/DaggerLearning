package com.kishorramani.daggerlearning

import android.util.Log
import javax.inject.Inject

private const val TAG = "UserRepository"

class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String) {
        Log.e(TAG, "User saved in DB")
    }
}
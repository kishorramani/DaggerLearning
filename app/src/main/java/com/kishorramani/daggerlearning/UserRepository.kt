package com.kishorramani.daggerlearning

import android.util.Log
import com.kishorramani.daggerlearning.scopes.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "ki- UserRepository"

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ApplicationScope
class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(TAG, "User saved in SQL DB")
    }
}

class FirebaseRepository: UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(TAG, "User saved in Firebase DB")
    }

}
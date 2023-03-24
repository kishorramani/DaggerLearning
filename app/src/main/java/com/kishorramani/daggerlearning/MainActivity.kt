package com.kishorramani.daggerlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kishorramani.daggerlearning.component.DaggerUserRegistrationComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerComponent = DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService = daggerComponent.getUserRegistrationService()
        val emailService = daggerComponent.emailService()

        userRegistrationService.registerUser("user1@gmail.com", "user@123")
    }
}


/*
consumer @inject
producer @Provides, @Module, @Binds
connector @Component
*/

/*
unit testing
single responsibility
lifetime of these object
extensible
*/

/*
We need to provide two information to dagger
How object is created
Where we consuming that object
*/


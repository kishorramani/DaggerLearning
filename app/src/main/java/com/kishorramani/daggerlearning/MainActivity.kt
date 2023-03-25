package com.kishorramani.daggerlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kishorramani.daggerlearning.component.DaggerUserRegistrationComponent
import com.kishorramani.daggerlearning.modules.NotificationServiceModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService   //This is field injection example

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val daggerComponent = DaggerUserRegistrationComponent.builder()
            .notificationServiceModule(NotificationServiceModule(3))
            .build()*/
        val daggerComponent = DaggerUserRegistrationComponent.factory().create(3)
        daggerComponent.mainInject(this)

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


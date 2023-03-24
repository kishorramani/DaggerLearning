package com.kishorramani.daggerlearning.component

import com.kishorramani.daggerlearning.EmailService
import com.kishorramani.daggerlearning.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService() : UserRegistrationService

    fun emailService(): EmailService
}
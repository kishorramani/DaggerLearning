package com.kishorramani.daggerlearning

import com.kishorramani.daggerlearning.qualifiers.MessageQualifier
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
    //@Named("message") private val notificationService: NotificationService        //there is chance of typo
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-reply@kishorramani.com", "User Registered")
    }
}



package com.kishorramani.daggerlearning

class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "no-reply@kishorramani.com", "User Registered")
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

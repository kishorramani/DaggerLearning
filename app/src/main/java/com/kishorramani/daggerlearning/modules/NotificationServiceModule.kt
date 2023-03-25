package com.kishorramani.daggerlearning.modules

import com.kishorramani.daggerlearning.EmailService
import com.kishorramani.daggerlearning.MessageService
import com.kishorramani.daggerlearning.NotificationService
import com.kishorramani.daggerlearning.qualifiers.MessageQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
//class NotificationServiceModule(private val retryCount: Int) {
class NotificationServiceModule {

    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int) : NotificationService {
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }
}

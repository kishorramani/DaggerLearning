package com.kishorramani.daggerlearning.modules

import com.kishorramani.daggerlearning.EmailService
import com.kishorramani.daggerlearning.MessageService
import com.kishorramani.daggerlearning.NotificationService
import com.kishorramani.daggerlearning.qualifiers.MessageQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService {
        return MessageService()
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return emailService
    }
}

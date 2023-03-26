package com.kishorramani.daggerlearning.modules

import com.kishorramani.daggerlearning.EmailService
import com.kishorramani.daggerlearning.MessageService
import com.kishorramani.daggerlearning.NotificationService
import com.kishorramani.daggerlearning.qualifiers.MessageQualifier
import com.kishorramani.daggerlearning.scopes.ActivityScope
import com.kishorramani.daggerlearning.scopes.ApplicationScope
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
//class NotificationServiceModule(private val retryCount: Int) {
class NotificationServiceModule {

    @ActivityScope
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

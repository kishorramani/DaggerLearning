package com.kishorramani.daggerlearning.modules

import com.kishorramani.daggerlearning.MessageService
import com.kishorramani.daggerlearning.NotificationService
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getMessageService() : NotificationService {
        return MessageService()
    }

    /*@Provides
    fun getMessageService(messageService: MessageService) : NotificationService {
        return messageService
    }*/
}
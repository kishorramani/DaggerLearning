package com.kishorramani.daggerlearning.modules

import com.kishorramani.daggerlearning.SQLRepository
import com.kishorramani.daggerlearning.UserRepository
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository
}
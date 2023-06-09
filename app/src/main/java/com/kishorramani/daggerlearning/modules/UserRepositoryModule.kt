package com.kishorramani.daggerlearning.modules

import com.kishorramani.daggerlearning.SQLRepository
import com.kishorramani.daggerlearning.UserRepository
import com.kishorramani.daggerlearning.scopes.ActivityScope
import com.kishorramani.daggerlearning.scopes.ApplicationScope
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository
}
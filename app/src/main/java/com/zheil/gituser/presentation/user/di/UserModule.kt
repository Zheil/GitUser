package com.zheil.gituser.presentation.user.di

import com.zheil.gituser.presentation.user.interactor.IUserInteractor
import com.zheil.gituser.presentation.user.interactor.MockUserInteractor
import com.zheil.gituser.presentation.user.interactor.UserInteractor
import com.zheil.gituser.presentation.user.model.UserMapper
import dagger.Module
import dagger.Provides

@Module
class UserModule {

    @Provides
    fun provideUserInteractor(): IUserInteractor = UserInteractor()

    @MOCK
    @Provides
    //@Named("mock")
    fun provideMockUserInteractor(): IUserInteractor = MockUserInteractor()

    @Provides
    fun provideMapper(): UserMapper = UserMapper()
}
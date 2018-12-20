package com.zheil.gituser.di

import com.zheil.gituser.presentation.user.interactor.IUserInteractor
import com.zheil.gituser.presentation.user.interactor.MockUserInteractor
import com.zheil.gituser.presentation.user.interactor.UserInteractor
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
}
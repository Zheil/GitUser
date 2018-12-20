package com.zheil.gituser.presentation.user.di

import com.zheil.gituser.data.network.Api
import com.zheil.gituser.presentation.user.interactor.IUserInteractor
import com.zheil.gituser.presentation.user.interactor.MockUserInteractor
import com.zheil.gituser.presentation.user.interactor.UserInteractor
import com.zheil.gituser.presentation.user.model.UserMapper
import dagger.Module
import dagger.Provides

@Module
class UserModule {

    @UserScope
    @Provides
    fun provideUserInteractor(api: Api): IUserInteractor = UserInteractor(api)

    @MOCK
    @UserScope
    @Provides
    //@Named("mock")
    fun provideMockUserInteractor(api: Api): IUserInteractor = MockUserInteractor(api)

    @Provides
    fun provideMapper(): UserMapper = UserMapper()
}
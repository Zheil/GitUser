package com.zheil.gituser.data.di

import com.zheil.gituser.data.network.Api
import com.zheil.gituser.data.network.RequestApi
import dagger.Module
import dagger.Provides


@Module(includes = [NetworkModule::class])
class AppModule {

    @AppScope
    @Provides
    fun provideApi(requestApi: RequestApi): Api = Api(requestApi)

}
package com.zheil.gituser.data.di

import com.zheil.gituser.data.network.Api
import com.zheil.gituser.data.network.RequestApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


@Module(includes = [NetworkModule::class])
class AppModule {

    @Provides
    fun provideApi(requestApi: RequestApi): Api = Api(requestApi)

}
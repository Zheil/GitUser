package com.zheil.gituser.data.di

import com.zheil.gituser.data.network.Api
import dagger.Component


@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {

    fun initRequestApi(): Api

}
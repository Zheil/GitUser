package com.zheil.gituser.data.di

import com.zheil.gituser.data.network.Api
import com.zheil.gituser.data.network.RequestApi
import dagger.Component


@Component(modules = [AppModule::class])
//@Component()
interface AppComponent {

    fun initRequestApi(): Api

}
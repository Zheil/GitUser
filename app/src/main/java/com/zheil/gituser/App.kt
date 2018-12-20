package com.zheil.gituser

import android.app.Activity
import android.app.Application
import com.zheil.gituser.data.di.AppComponent
//import com.zheil.gituser.data.di.DaggerAppComponent


class App: Application() {

    private lateinit var mAppComponent: AppComponent

    companion object {
        fun get(activity: Activity): App = (activity.application as App)
    }

    override fun onCreate() {
        super.onCreate()

        //DaggerAppComponent.create()
    }

    fun getAppComponent() = mAppComponent
}
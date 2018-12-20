package com.zheil.gituser.presentation.user.di

import com.zheil.gituser.data.di.AppModule
import com.zheil.gituser.presentation.user.UserViewModel
import dagger.Component

@Component(modules = [UserModule::class, AppModule::class])
interface UserComponent {

    fun inject(viewModel: UserViewModel)
}
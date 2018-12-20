package com.zheil.gituser.presentation.user.di

import com.zheil.gituser.presentation.user.UserViewModel
import dagger.Component

@Component(modules = [UserModule::class])
interface UserComponent {

    fun inject(viewModel: UserViewModel)
}
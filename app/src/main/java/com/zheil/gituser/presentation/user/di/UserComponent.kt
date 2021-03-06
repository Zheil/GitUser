package com.zheil.gituser.presentation.user.di

import com.zheil.gituser.data.di.AppComponent
import com.zheil.gituser.presentation.user.UserFragment
import com.zheil.gituser.presentation.user.UserViewModel
import dagger.Component

@UserScope
@Component(modules = [UserModule::class], dependencies = [AppComponent::class])
interface UserComponent {

    fun inject(viewModel: UserViewModel)
    fun inject(viewModel: UserFragment)
}
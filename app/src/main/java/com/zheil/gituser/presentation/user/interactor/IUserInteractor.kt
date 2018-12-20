package com.zheil.gituser.presentation.user.interactor


interface IUserInteractor {

    fun getUser(onSuccess: (userName: String) -> Unit)
}
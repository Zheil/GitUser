package com.zheil.gituser.presentation.user.interactor


class UserInteractor: IUserInteractor {
    override fun getUser(onSuccess: (userName: String) -> Unit) {
       onSuccess("REAL USER")
    }
}
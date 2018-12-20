package com.zheil.gituser.user


class UserInteractor {
    fun getUser(onSuccess: (userName: String) -> Unit) {
       onSuccess("TEST NAME")
    }
}
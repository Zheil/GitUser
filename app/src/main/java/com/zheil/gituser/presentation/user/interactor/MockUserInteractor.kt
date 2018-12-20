package com.zheil.gituser.presentation.user.interactor


class MockUserInteractor: IUserInteractor {
    override fun getUser(onSuccess: (userName: String) -> Unit) {
        onSuccess("MOCK USER")
    }
}
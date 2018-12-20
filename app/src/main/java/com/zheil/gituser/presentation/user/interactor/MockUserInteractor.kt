package com.zheil.gituser.presentation.user.interactor

import com.zheil.gituser.data.model.GitUserShortModel


class MockUserInteractor: IUserInteractor {
    override fun getUser(onSuccess: (userModel: GitUserShortModel) -> Unit) {
        val mockModel =
                GitUserShortModel(
                        login = "MOCK LOGIN",
                        id = 100,
                        avatarUrl = "https://www.bitgab.com/uploads/profile/files/default.png",
                        url = "http://github.com",
                        htmlUrl = "http://github.com/about",
                        name = "NAME USER",
                        email = "mock@mail.abc",
                        createdAt = "10.10.2017",
                        updatedAt = "20.12.2018"
                )
        onSuccess(mockModel)
    }
}
package com.zheil.gituser.presentation.user.interactor

import com.zheil.gituser.data.model.GitUserShortModel


class UserInteractor: IUserInteractor {
    override fun getUser(onSuccess: (userModel: GitUserShortModel) -> Unit) {
       //onSuccess("REAL USER")
    }
}
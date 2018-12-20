package com.zheil.gituser.presentation.user.interactor

import com.zheil.gituser.data.model.GitUserShortModel


interface IUserInteractor {

    fun getUser(onSuccess: (userModel: GitUserShortModel) -> Unit)
}
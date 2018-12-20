package com.zheil.gituser.presentation.user.model

import com.zheil.gituser.data.model.GitUserShortModel


class UserMapper {

    fun map(responseModel: GitUserShortModel): UiModelUser {
        responseModel.let {
            return UiModelUser(
                    login = it.login,
                    name = it.name,
                    urlAvatar = it.avatarUrl)
        }
    }
}
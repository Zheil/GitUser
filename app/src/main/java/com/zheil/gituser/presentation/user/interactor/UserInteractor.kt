package com.zheil.gituser.presentation.user.interactor

import android.util.Log
import com.zheil.gituser.data.model.GitUserShortModel
import com.zheil.gituser.data.network.Api


class UserInteractor(private val mApi: Api): IUserInteractor {

    override fun getUser(onSuccess: (userModel: GitUserShortModel) -> Unit) {
        mApi.getUser("zheil", onSuccess, onFailure = {
            error -> Log.d("MYLOG", error.message)
        })
    }
}
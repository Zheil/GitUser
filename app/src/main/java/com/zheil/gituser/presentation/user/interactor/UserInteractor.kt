package com.zheil.gituser.presentation.user.interactor

import android.util.Log
import com.zheil.gituser.data.model.GitUserShortModel
import com.zheil.gituser.data.network.Api
import javax.inject.Inject


class UserInteractor(private val mApi: Api): IUserInteractor {
   //private val mApi = Api()

    //@Inject lateinit var mApi: Api

    override fun getUser(onSuccess: (userModel: GitUserShortModel) -> Unit) {
       //onSuccess("REAL USER")
        mApi.getUser("zheil", onSuccess, onFailure = {
            error -> Log.d("MYLOG", error.message)
        })
    }
}
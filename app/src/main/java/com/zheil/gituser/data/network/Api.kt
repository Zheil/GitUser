package com.zheil.gituser.data.network

import android.annotation.SuppressLint
import android.util.Log
import com.zheil.gituser.data.model.GitUserShortModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class Api(private val mApi: RequestApi) {
    @SuppressLint("CheckResult")
    fun getUser(user: String,
                onSuccess: (user: GitUserShortModel) -> Unit,
                onFailure: (exception: Throwable) -> Unit) {

        mApi.getUser(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({
                    result -> onSuccess(result)
                    Log.d("MYLOG" , result.toString())
                },{
                    error -> onFailure(error) })
    }
}
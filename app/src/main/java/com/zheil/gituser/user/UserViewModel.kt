package com.zheil.gituser.user

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log


class UserViewModel: ViewModel() {

    val mUserName = MutableLiveData<String>()
    private val mInteractor = UserInteractor()

    fun onClickBtnSearch() {
        mInteractor.getUser {
            name -> mUserName.value = "$name"
        }

    }

}
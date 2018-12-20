package com.zheil.gituser.presentation.user

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.zheil.gituser.presentation.user.interactor.UserInteractor


class UserViewModel: ViewModel() {

    val mUserName = MutableLiveData<String>()
    private val mInteractor = UserInteractor()

    fun onClickBtnSearch() {
        mInteractor.getUser {
            name -> mUserName.value = "$name"
        }

    }

}
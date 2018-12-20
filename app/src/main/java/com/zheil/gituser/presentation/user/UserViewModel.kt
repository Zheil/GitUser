package com.zheil.gituser.presentation.user

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.zheil.gituser.di.DaggerUserComponent
import com.zheil.gituser.di.MOCK
import com.zheil.gituser.di.UserModule
import com.zheil.gituser.presentation.user.interactor.IUserInteractor
import javax.inject.Inject


class UserViewModel: ViewModel() {

    @Inject
    @field:MOCK
    //@field:Named("mock")
    lateinit var mInteractor: IUserInteractor

    init {
        DaggerUserComponent
                .builder()
                .userModule(UserModule())
                .build()
                .inject(this)
    }

    val mUserName = MutableLiveData<String>()

    fun onClickBtnSearch() {
        mInteractor.getUser {
            name -> mUserName.value = "$name"
        }
    }
}
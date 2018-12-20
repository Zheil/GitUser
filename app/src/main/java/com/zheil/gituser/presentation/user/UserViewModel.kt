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

    val mUserLogin = MutableLiveData<String>()
    val mUserName = MutableLiveData<String>()

    init {
        DaggerUserComponent
                .builder()
                .userModule(UserModule())
                .build()
                .inject(this)
    }



    fun onClickBtnSearch() {
        mInteractor.getUser {
            item ->
            mUserName.value = item.name
            mUserLogin.value = item.login
        }
    }
}
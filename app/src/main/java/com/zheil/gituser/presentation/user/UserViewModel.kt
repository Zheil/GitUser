package com.zheil.gituser.presentation.user

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.zheil.gituser.di.DaggerUserComponent
import com.zheil.gituser.di.MOCK
import com.zheil.gituser.di.UserModule
import com.zheil.gituser.presentation.user.interactor.IUserInteractor
import com.zheil.gituser.presentation.user.model.UserMapper
import javax.inject.Inject


class UserViewModel(private val app: Application): AndroidViewModel(app) {

    @Inject
    @field:MOCK
    //@field:Named("mock")
    lateinit var mInteractor: IUserInteractor

    @Inject
    lateinit var mMapper: UserMapper

    val mUserLogin = MutableLiveData<String>()
    val mUserName = MutableLiveData<String>()
    val mUserAvatarUrl = MutableLiveData<String>()

    init {
        DaggerUserComponent
                .builder()
                .userModule(UserModule())
                .build()
                .inject(this)
    }


    fun onClickBtnSearch() {
        onSearchStart()
    }

    private fun onSearchStart() {
        mInteractor.getUser {
            item ->
            val uiModel = mMapper.map(item)
            uiModel.let {
                mUserName.value = it.name
                mUserLogin.value = it.login
                mUserAvatarUrl.value = it.urlAvatar
            }
        }
    }
}
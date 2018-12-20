package com.zheil.gituser.presentation.user

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.Context
import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.zheil.gituser.R
import com.zheil.gituser.di.DaggerUserComponent
import com.zheil.gituser.di.MOCK
import com.zheil.gituser.di.UserModule
import com.zheil.gituser.presentation.user.interactor.IUserInteractor
import javax.inject.Inject


class UserViewModel(private val app: Application): AndroidViewModel(app) {

    @Inject
    @field:MOCK
    //@field:Named("mock")
    lateinit var mInteractor: IUserInteractor

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
            mUserName.value = item.name
            mUserLogin.value = item.login
            mUserAvatarUrl.value = item.avatarUrl
        }
    }

}
package com.zheil.gituser.presentation.user

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zheil.gituser.App
import com.zheil.gituser.presentation.base.BaseFragment
import com.zheil.gituser.databinding.FragmentUserBinding
import com.zheil.gituser.presentation.user.di.DaggerUserComponent


class UserFragment: BaseFragment<FragmentUserBinding, UserViewModel>() {

    private lateinit var mUserViewModel: UserViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = FragmentUserBinding.inflate(inflater, container, false)
        mUserViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        mBinding.setLifecycleOwner(this)
        mBinding.mainView = mUserViewModel
        initDagger()
        return mBinding.root
    }

    private fun initDagger() {
            DaggerUserComponent
                    .builder()
                    .appComponent(App.get(activity!!).getAppComponent())
                    .build()
                    .inject(mUserViewModel)
    }
}
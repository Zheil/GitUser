package com.zheil.gituser.presentation.user

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zheil.gituser.R
import com.zheil.gituser.presentation.base.BaseFragment
import com.zheil.gituser.databinding.FragmentUserBinding


class UserFragment: BaseFragment() {

    private lateinit var mUserViewModel: UserViewModel

    override fun getLayoutResourceId(): Int = R.layout.fragment_user

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentUserBinding = DataBindingUtil.inflate(inflater, getLayoutResourceId(), container, false)
        mUserViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        binding.setLifecycleOwner(this)
        binding.mainView = mUserViewModel
        return binding.root
    }
}
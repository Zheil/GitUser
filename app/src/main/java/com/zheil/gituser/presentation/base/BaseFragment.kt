package com.zheil.gituser.presentation.base

import android.arch.lifecycle.ViewModel
import android.databinding.ViewDataBinding
import android.support.v4.app.Fragment


abstract class BaseFragment<B: ViewDataBinding, V: ViewModel>: Fragment() {

    protected lateinit var mBinding: B

}
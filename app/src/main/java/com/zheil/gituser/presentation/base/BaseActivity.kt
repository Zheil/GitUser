package com.zheil.gituser.presentation.base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment


abstract class BaseActivity: AppCompatActivity() {

    protected abstract fun getLayoutResourceId(): Int
    protected abstract fun getContainerResourceId(): Int

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResourceId())
    }

    protected fun setupFragment(fragment: BaseFragment) {
        val currentFragment: Fragment? = supportFragmentManager.findFragmentById(getContainerResourceId())
        if (currentFragment == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(getContainerResourceId(), fragment)
                    .commit()
        }
    }

    protected fun replaceFragment(fragment: BaseFragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(getContainerResourceId(), fragment)
                .commit()
    }
}
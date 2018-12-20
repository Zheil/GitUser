package com.zheil.gituser.base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


abstract class BaseActivity: AppCompatActivity() {

    protected abstract fun getLayoutResourceId(): Int

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResourceId())
    }
}
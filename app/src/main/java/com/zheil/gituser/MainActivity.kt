package com.zheil.gituser

import android.os.Bundle
import com.zheil.gituser.base.BaseActivity
import com.zheil.gituser.user.UserFragment

class MainActivity: BaseActivity() {
    override fun getContainerResourceId(): Int = R.id.main_container

    override fun getLayoutResourceId(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupFragment(UserFragment())
    }
}

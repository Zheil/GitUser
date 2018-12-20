package com.zheil.gituser

import android.os.Bundle
import com.zheil.gituser.base.BaseActivity

class MainActivity: BaseActivity() {
    override fun getLayoutResourceId(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

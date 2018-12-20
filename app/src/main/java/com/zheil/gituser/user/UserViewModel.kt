package com.zheil.gituser.user

import android.arch.lifecycle.ViewModel
import android.util.Log


class UserViewModel: ViewModel() {

    fun onClickBtnSearch() {
        Log.d("MYLOG", "CLICKED!")
    }

}
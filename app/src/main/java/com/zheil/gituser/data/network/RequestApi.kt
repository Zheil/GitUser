package com.zheil.gituser.data.network

import com.zheil.gituser.data.model.GitUserShortModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path


interface RequestApi {

    @GET("users/{user}")
    fun getUser(@Path("user") user: String): Observable<GitUserShortModel>
}
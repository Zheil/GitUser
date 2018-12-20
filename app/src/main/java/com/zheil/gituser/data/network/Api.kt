package com.zheil.gituser.data.network

import android.annotation.SuppressLint
import android.util.Log
import com.zheil.gituser.data.model.GitUserShortModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class Api(private val mApi: RequestApi) {
    //private val mApi = getRetrofit().create(RequestApi::class.java)
    private val URL = "https://api.github.com/"

    private fun getRetrofit(): Retrofit {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)
                .readTimeout(30, TimeUnit.SECONDS) //30 seconds for slow connections
                .writeTimeout(30, TimeUnit.SECONDS)

        return Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build()
    }

    @SuppressLint("CheckResult")
    fun getUser(user: String,
                onSuccess: (user: GitUserShortModel) -> Unit,
                onFailure: (exception: Throwable) -> Unit) {

        mApi.getUser(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({
                    result -> onSuccess(result)
                    Log.d("MYLOG" , result.toString())
                },{
                    error -> onFailure(error) })
    }
}
package com.zheil.gituser.data.adapter

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.zheil.gituser.R


class BindingAdapters {

    companion object {

        @BindingAdapter("app:imageLoad")
        @JvmStatic
        fun loadImage(view: ImageView, url: String?) {
            url?.let {
                Picasso.get()
                        .load(url)
                        .placeholder(R.mipmap.ic_holder_load)
                        .into(view)}
        }
    }
}
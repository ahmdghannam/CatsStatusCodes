package com.example.catsstatuscodes.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["app:setUrlSrc"])
fun ImageView.setUrlSrc(code: String?) {
    if(code == null) return

    val BASE_URL="https://http.cat/$code.jpg"
    Glide.with(this)
        .load(BASE_URL)
        .into(this)
}
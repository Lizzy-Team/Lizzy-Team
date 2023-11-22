package com.example.remember_lizzy.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

object Extension {

        fun ImageView.showImageInto(context: Context, url: String) {
            Glide.with(context)
                .load(url)
                .into(this)
    }
}
package com.example.remember_lizzy.utils

import android.content.Context
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

object ExtensionGambarBulat {
    fun CircleImageView.showImageIntoV2(context: Context, url: String) {
        Glide.with(context)
            .load(url)
            .into(this)
    }
}
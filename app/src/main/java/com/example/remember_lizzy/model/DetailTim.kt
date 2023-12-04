package com.example.remember_lizzy.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailTim(
val id:Int,
val name:String,
    val ttg:String,
    val iconcal:String,
    val des:String,
    val tim:String,
    val ketua:String,
    val progressbarmin:Int
):Parcelable

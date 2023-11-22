package com.example.remember_lizzy.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.text.DateFormat
import java.util.TimeZone

@Parcelize
data class DetailTim(
val id:Int,
val name:String,
    val ttg:String,
    val iconcal:String,
    val progressbarmin:Int
):Parcelable

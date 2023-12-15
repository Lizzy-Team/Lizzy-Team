package com.example.remember_lizzy.model

import android.os.Parcelable
import android.provider.ContactsContract.Data
import kotlinx.android.parcel.Parcelize


data class detailtimModel (
    val data : List<Data>
){

    @Parcelize
    data class Data (
        val id:Int,
        val nama:String,
        val ttg:String,
        val iconcal:String,
        val des:String,
        val tim:String,
        val ketua:String,
        val progressbarmin:Int
    ): Parcelable
}

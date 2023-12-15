package com.example.remember_lizzy.interfaces

import com.example.remember_lizzy.model.detailtimModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    @GET("read.php")
    fun data() : Call<detailtimModel>

}
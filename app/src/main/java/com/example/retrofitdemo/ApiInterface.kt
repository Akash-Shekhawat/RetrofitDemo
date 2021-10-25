package com.example.retrofitdemo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("/posts")
    fun getData( @Query("id") id: Int): Call<List<MyDataItem>>
}
package com.umutyusufcinar.vize3app.service

import com.umutyusufcinar.vize3app.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface DummyService {

    @GET("users")
    fun getProducts() : Call<User>

    // https://dummyjson.com/users/filter?key=firstName&value=Terry

    // // https://dummyjson.com/users/filter?key=firstName&value="Terry"

    @GET("users/filter")
    fun getUsersByFirstName(
        @Query("key") key: String = "firstName",
        @Query("value") value: String
    ): Call<User>

    @GET("users/filter")
    fun getUsersByLastName(
        @Query("key") key: String = "lastName",
        @Query("value") value: String
    ): Call<User>

    @GET("users/filter")
    fun getUsersByAge(
        @Query("key") key: String = "age",
        @Query("value") value: Int
    ): Call<User>

    @GET("users/filter")
    fun getUsersByBlood(
        @Query("key") key: String = "bloodGroup",
        @Query("value") value: String
    ): Call<User>


}
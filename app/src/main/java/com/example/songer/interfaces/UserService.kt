package com.example.songer.interfaces

import com.example.songer.models.Users
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService{
    @POST("user")
    fun addUser(@Body users: Users) : Call<Users>
}
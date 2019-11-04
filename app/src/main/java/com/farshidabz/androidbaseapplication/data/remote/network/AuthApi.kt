package com.farshidabz.androidbaseapplication.data.remote.network

import com.farshidabz.androidbaseapplication.data.model.BaseModel
import com.farshidabz.androidbaseapplication.data.model.requestsmodel.RegisterModel
import com.farshidabz.androidbaseapplication.di.network.RetrofitCall
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Farshid Abazari since 25/10/19
 *
 * Usage: a interface to define end points
 *
 * How to call: just add in appInjector and repositoryImpl that you wanna use
 *
 */
interface AuthApi {
    @POST("register")
    fun registerUser(@Body registerModel: RegisterModel) : RetrofitCall<BaseModel>
}
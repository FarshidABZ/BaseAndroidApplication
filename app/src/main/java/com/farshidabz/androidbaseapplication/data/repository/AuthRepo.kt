package com.farshidabz.androidbaseapplication.data.repository

import android.content.Context
import com.farshidabz.androidbaseapplication.data.model.BaseModel
import com.farshidabz.androidbaseapplication.data.model.requestsmodel.RegisterModel
import com.farshidabz.androidbaseapplication.data.remote.network.AuthApi
import com.farshidabz.androidbaseapplication.di.network.RetrofitCallback
import com.farshidabz.androidbaseapplication.utils.ResponseLiveData
import com.farshidabz.androidbaseapplication.utils.buildAMessage
import retrofit2.Response
import java.io.IOException

/**
 * Created by Farshid Abazari since 25/10/19
 *
 * Usage: Authentication repository class to handle auth tasks
 *
 * How to call: just create a single object in AppInjector and pass it to viewModel
 *
 */

class AuthRepo(private val context: Context, private var authApi: AuthApi) {

    fun registerUser(phoneNumber: String): ResponseLiveData<BaseModel> {
        val data = ResponseLiveData<BaseModel>()
        authApi.registerUser(RegisterModel().apply { this.phoneNumber = phoneNumber })
            .enqueue(object : RetrofitCallback<BaseModel> {
                override fun success(response: Response<BaseModel>) {
                    data.value = response.body()
                }

                override fun failure(
                    response: Response<*>?,
                    e: IOException?,
                    t: Throwable?,
                    networkResponseType: Int
                ) {
                    data.value = BaseModel().apply {
                        isSuccessful = false
                        statusCode = networkResponseType
                        apiResponseMessage = buildAMessage(networkResponseType, response)
                    }
                }
            })

        return data
    }
}
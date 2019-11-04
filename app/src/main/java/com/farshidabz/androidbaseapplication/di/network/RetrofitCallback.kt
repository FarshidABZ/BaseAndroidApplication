package com.farshidabz.androidbaseapplication.di.network


import com.farshidabz.androidbaseapplication.annotation.NetworkResponseType
import retrofit2.Response
import java.io.IOException

/** A callback which offers granular callbacks for various conditions.  */
interface RetrofitCallback<T> {
    /** Called for [200, 300) responses.  */
    fun success(response: Response<T>)

    fun failure(
        response: Response<*>? = null,
        e: IOException? = null,
        t: Throwable? = null,
        @NetworkResponseType networkResponseType: Int
    )
}

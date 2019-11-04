package com.farshidabz.androidbaseapplication.di

import com.farshidabz.androidbaseapplication.data.remote.network.*
import org.koin.dsl.module
import retrofit2.Retrofit


/**
 * Created by Farshid Abazari since 25/10/19
 *
 * Usage: this methods handle DI
 *
 * How to call: just startActivityForResult koin in application class
 *
 */

private val baseRetrofit: Retrofit = createBaseNetworkClient()
private val authRetrofit: Retrofit = createAuthNetworkClient()

private val authApi: AuthApi = authRetrofit.create(AuthApi::class.java)

private val generalApi: GeneralApi = baseRetrofit.create(GeneralApi::class.java)
private val userApi: UserApi = baseRetrofit.create(UserApi::class.java)
private val catalogApi: CatalogApi = baseRetrofit.create(CatalogApi::class.java)

val networkModule = module {
    single { authApi }
    single { generalApi }
    single { userApi }
    single { catalogApi }
}

//val remoteConfigModule = module {
//    single { RemoteConfigRepo(androidContext(), getRemoteConfigInstance()) }
//}

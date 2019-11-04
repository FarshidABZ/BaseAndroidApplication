package com.farshidabz.androidbaseapplication.di

import com.farshidabz.androidbaseapplication.data.repository.AuthRepo
import com.farshidabz.androidbaseapplication.data.repository.CatalogRepo
import com.farshidabz.androidbaseapplication.data.repository.GeneralRepo
import com.farshidabz.androidbaseapplication.data.repository.UserRepo
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


/**
 * Created by Farshid Abazari since 25/10/19
 *
 * Usage:
 *
 * How to call:
 *
 * Useful parameter:
 *
 */

val repositoryModule = module {
    single { AuthRepo(androidContext(), authApi = get()) }
    single { GeneralRepo(androidContext(), generalApi = get()) }
    single { UserRepo(androidContext(), userApi = get()) }
    single { CatalogRepo(androidContext(), catalogApi = get()) }

//    single { LocationHandler(get()) }
}
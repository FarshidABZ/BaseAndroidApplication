package com.farshidabz.androidbaseapplication.di

import com.farshidabz.androidbaseapplication.view.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
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

val viewModelModule = module {
    viewModel { MainViewModel() }
}

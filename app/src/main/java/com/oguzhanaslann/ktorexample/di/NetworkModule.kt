package com.oguzhanaslann.ktorexample.di

import com.oguzhanaslann.ktorexample.datasource.network.NetworkSource
import com.oguzhanaslann.ktorexample.datasource.network.RandomUserApi
import org.koin.dsl.module

val networkModule = module {
    single<NetworkSource>{
        RandomUserApi()
    }
}
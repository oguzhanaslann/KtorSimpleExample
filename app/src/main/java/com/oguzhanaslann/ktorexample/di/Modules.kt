package com.oguzhanaslann.ktorexample.di

import org.koin.core.module.Module

fun getApplicationModules() : List<Module> = listOf(networkModule, viewModelModule)
package com.oguzhanaslann.ktorexample.di

import com.oguzhanaslann.ktorexample.datasource.repository.RandomPersonRepository
import com.oguzhanaslann.ktorexample.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    factory {
        RandomPersonRepository(get())
    }

    viewModel {
        MainViewModel(get())
    }
}
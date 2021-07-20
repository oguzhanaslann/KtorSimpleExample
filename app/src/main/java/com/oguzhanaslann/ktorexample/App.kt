package com.oguzhanaslann.ktorexample

import android.app.Application
import com.oguzhanaslann.ktorexample.di.getApplicationModules
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            androidLogger(Level.DEBUG)
            modules(
                getApplicationModules()
            )
        }
    }
}
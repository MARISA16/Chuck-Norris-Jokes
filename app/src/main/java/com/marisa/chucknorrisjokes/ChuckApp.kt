package com.marisa.chucknorrisjokes

import android.app.Application
import com.marisa.chucknorrisjokes.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ChuckApp: Application() {
    override fun onCreate() {
        super.onCreate()
// iniciar o Koin
        startKoin {
          androidLogger()
            androidContext(this@ChuckApp)

            modules(mainModule)
        }
    }
}
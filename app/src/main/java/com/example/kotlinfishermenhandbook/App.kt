package com.example.kotlinfishermenhandbook

import android.app.Application
import com.example.kotlinfishermenhandbook.data.FishermenRepositoryImpl

class App : Application() {

    val impl by lazy {
        FishermenRepositoryImpl(applicationContext)
    }
}
package com.example.pampertemuan14

import android.app.Application
import com.example.pampertemuan14.di.AppContainer
import com.example.pampertemuan14.di.MahasiswaContainer

class MahasiswaApplication: Application() {

    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}
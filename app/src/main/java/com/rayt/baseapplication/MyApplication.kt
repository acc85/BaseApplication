package com.rayt.baseapplication

import android.app.Application
import com.rayt.repository.DaggerRepositoryComponent

class MyApplication:Application(){


    override fun onCreate() {
        super.onCreate()

        val repoComponent = DaggerRepositoryComponent.builder().withContext(this).build()


    }
}
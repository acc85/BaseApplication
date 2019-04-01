package com.rayt.baseapplication

import android.app.Application
import com.rayt.repository.di.components.DaggerRepositoryComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MyApplication: DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().repositoryComponent(DaggerRepositoryComponent.builder().withContext(this).build()).build()
    }


    override fun onCreate() {
        super.onCreate()

    }
}
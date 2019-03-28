package com.rayt.baseapplication

import com.rayt.repository.RepositoryComponent
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication

@Component(modules = [AndroidSupportInjectionModule::class,ActivityFragmentModule::class],dependencies = [RepositoryComponent::class])
@AppScope
interface AppComponent : AndroidInjector<MyApplication>{

    fun inject(instance: DaggerApplication)
}


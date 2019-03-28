package com.rayt.baseapplication

import com.rayt.repository.RepositoryComponent
import dagger.Component
import dagger.android.AndroidInjector

@Component(dependencies = [RepositoryComponent::class])
@AppScope
interface AppComponent : AndroidInjector<MyApplication>


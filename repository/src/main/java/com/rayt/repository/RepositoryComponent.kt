package com.rayt.repository

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(modules = [RetrofitModule::class])
@RepositoryScope
interface RepositoryComponent{

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun withContext(context: Context):Builder
        fun build(): RepositoryComponent
    }
}

package com.rayt.repository.di.components

import android.content.Context
import com.rayt.repository.di.scopes.RepositoryScope
import com.rayt.repository.SharedPreferencesRepo
import com.rayt.repository.di.modules.DatabaseModule
import com.rayt.repository.di.modules.RetrofitModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [RetrofitModule::class, DatabaseModule::class, SharedPreferencesRepo::class])
@RepositoryScope
interface RepositoryComponent{

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun withContext(context: Context): Builder
        fun build(): RepositoryComponent
    }
}

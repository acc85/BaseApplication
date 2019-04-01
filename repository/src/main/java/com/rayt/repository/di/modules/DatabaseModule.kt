package com.rayt.repository.di.modules

import android.content.Context
import com.rayt.repository.AppDatabase
import com.rayt.repository.di.scopes.RepositoryScope
import dagger.Module
import dagger.Provides

@Module
internal class DatabaseModule{

    @Provides
    @RepositoryScope
    internal fun provideDatabase(context: Context): AppDatabase?{
        return AppDatabase.getInstance(context)
    }

}
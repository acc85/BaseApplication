package com.rayt.repository

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
internal class DatabaseModule{

    @Provides
    @RepositoryScope
    internal fun provideDatabase(context: Context):AppDatabase?{
        return AppDatabase.getInstance(context)
    }

}
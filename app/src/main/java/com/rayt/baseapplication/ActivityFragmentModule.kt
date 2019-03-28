package com.rayt.baseapplication

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityFragmentModule{

    @ContributesAndroidInjector
    abstract fun provideMainActivity():MainActivity
}
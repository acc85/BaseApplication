package com.rayt.repository

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import javax.inject.Inject

@Module
internal class SharedPreferencesRepo @Inject internal constructor(context:Context) {

    var sharedPreferences :SharedPreferences = context.getSharedPreferences(EnvironmentConstants.SHARED_PREFERENCE_NAME, Context.MODE_PRIVATE)
    var sharedPreferencesEditor = sharedPreferences.edit()
}
package com.rayt.repository

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module(includes = [NetworkModule::class])
internal class RetrofitModule{

    @Provides
    @RepositoryScope
    fun provideRetrofit(okHttpClient: OkHttpClient, gson:Gson) : Retrofit =
            Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(EnvironmentConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .build()

    @Provides
    @RepositoryScope
    fun gson():Gson{
        return GsonBuilder().create()
    }


}
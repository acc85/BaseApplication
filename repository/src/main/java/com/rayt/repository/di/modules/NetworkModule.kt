package com.rayt.repository.di.modules

import android.content.Context
import com.rayt.repository.EnvironmentConstants
import com.rayt.repository.di.scopes.RepositoryScope
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.CertificatePinner
import okhttp3.Interceptor
import okhttp3.OkHttpClient

@Module
internal class NetworkModule{

    private val HTTP_RESPONSE_CACHE = (10*1024*1024).toLong()

    @Provides
    @RepositoryScope
    fun okHttpClient(networkInterceptor: Interceptor, cache: Cache, certificatePinner: CertificatePinner):OkHttpClient{
        return OkHttpClient.Builder()
            .addInterceptor(networkInterceptor)
            .cache(cache)
            .certificatePinner(certificatePinner)
            .build()
    }

    @Provides
    @RepositoryScope
    fun cache(context: Context):Cache{
        return Cache(context.cacheDir, HTTP_RESPONSE_CACHE)
    }

    @Provides
    @RepositoryScope
    fun certificatePinner():CertificatePinner{
        return CertificatePinner.Builder().also {certBuilder->
            EnvironmentConstants.certMap.forEach{ pair->
                certBuilder.add(pair.key,pair.value)
            }
        }.build()
    }
}
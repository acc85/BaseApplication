package com.rayt.domain.di.component

import com.rayt.domain.di.module.DomainModule
import dagger.Component

@Component(modules = [DomainModule::class])
interface DomainComponent{


    @Component.Builder
    interface Builder{
        fun build():DomainComponent
    }

}
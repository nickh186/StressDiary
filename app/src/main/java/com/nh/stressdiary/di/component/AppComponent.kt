package com.nh.stressdiary.di.component

import android.app.Application
import com.nh.stressdiary.StressDiaryApplication
import com.nh.stressdiary.di.module.ActivityModule
import com.nh.stressdiary.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityModule::class])
interface AppComponent :AndroidInjector<Application>{

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(app: Application): Builder
        fun build():AppComponent
    }

    fun inject(app: StressDiaryApplication)
}
package com.nh.stressdiary

import android.app.Activity
import android.app.Application
import com.nh.stressdiary.di.component.DaggerAppComponent
import com.nh.stressdiary.di.module.DbModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class StressDiaryApplication: Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingAndroidInjector
    }

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .application(this)
            .dbModule(DbModule())
            .build()
            .inject(this)
    }
}
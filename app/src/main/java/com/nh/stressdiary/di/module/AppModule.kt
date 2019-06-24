package com.nh.stressdiary.di.module

import com.nh.stressdiary.StressDiaryApplication
import dagger.Module

@Module
abstract class AppModule(private val app: StressDiaryApplication) {
//    @Binds
//    abstract fun app(app: Application):Application
}
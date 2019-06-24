package com.nh.stressdiary.di.module

import com.nh.stressdiary.ui.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeMainFragment():MainFragment
}
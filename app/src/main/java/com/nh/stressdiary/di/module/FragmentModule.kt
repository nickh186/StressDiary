package com.nh.stressdiary.di.module

import com.nh.stressdiary.ui.stress.StressItemFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeStressFragment(): StressItemFragment
}
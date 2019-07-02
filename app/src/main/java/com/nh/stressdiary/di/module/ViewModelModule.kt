package com.nh.stressdiary.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nh.stressdiary.factory.ViewModelFactory
import com.nh.stressdiary.ui.main.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModel(factory: ViewModelFactory) : ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    protected abstract fun bindMainViewModel(mainViewModel: MainViewModel) : ViewModel
}
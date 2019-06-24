package com.nh.stressdiary.di.module

import android.app.Application
import androidx.room.Room
import com.nh.stressdiary.data.local.AppDatabase
import com.nh.stressdiary.data.local.dao.StressEntryDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DbModule {

    @Provides
    @Singleton
    internal fun provideDatabase(app: Application) : AppDatabase {
        return Room
            .databaseBuilder(app.applicationContext, AppDatabase::class.java, "stress_db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    internal fun provideStressEntryDao(appDatabase: AppDatabase) : StressEntryDao {
        return appDatabase.stressEntryDao()
    }
}
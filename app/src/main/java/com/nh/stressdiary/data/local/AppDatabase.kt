package com.nh.stressdiary.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nh.stressdiary.data.local.dao.StressEntryDao
import com.nh.stressdiary.data.local.entity.StressEntryEntity

@Database(entities = [StressEntryEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun stressEntryDao(): StressEntryDao
}
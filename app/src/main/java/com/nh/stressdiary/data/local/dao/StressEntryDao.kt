package com.nh.stressdiary.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.nh.stressdiary.data.local.entity.StressEntryEntity

@Dao
interface StressEntryDao {

    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    fun insertStressEntry(stressEntryEntity: StressEntryEntity) : Long
}
package com.nh.stressdiary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stress_entry")
class StressEntryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val content: String)
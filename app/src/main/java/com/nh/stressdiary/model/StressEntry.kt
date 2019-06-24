package com.nh.stressdiary.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stressEntry")
data class StressEntry {
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val content: String,
}
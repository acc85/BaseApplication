package com.rayt.repository.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SampleTable")
data class SampleEntity(

    @PrimaryKey(autoGenerate = true)
    val id :Long = 0L
)
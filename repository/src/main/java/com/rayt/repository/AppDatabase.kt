package com.rayt.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.rayt.repository.database.SampleEntity

@Database(version = 1, entities = [SampleEntity::class])
abstract class AppDatabase:RoomDatabase(){


    companion object{
        private var INSTANCE : AppDatabase? = null

        fun getInstance(context: Context):AppDatabase?{
            if(INSTANCE == null){
                synchronized(AppDatabase::class){
                    INSTANCE = Room.databaseBuilder(context, AppDatabase::class.java, "app_database.db").build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance(){
            INSTANCE = null
        }
    }

}
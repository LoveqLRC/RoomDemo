package com.example.liaoruochen.roomdemo.db

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.liaoruochen.roomdemo.dao.RepoDao
import com.example.liaoruochen.roomdemo.entity.Repo
import com.example.liaoruochen.roomdemo.utilities.DATABASE_NAME


@Database(entities = [Repo::class], version = 1)
abstract class RepoDatabase : RoomDatabase() {

    abstract fun getRepoDao(): RepoDao


    companion object {

        @Volatile
        private var instance: RepoDatabase? = null

        fun getInstance(context: Context): RepoDatabase {

            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context)
            }
        }


        private fun buildDatabase(context: Context): RepoDatabase {
            return Room.databaseBuilder(context, RepoDatabase::class.java, DATABASE_NAME).build()
        }
    }

}
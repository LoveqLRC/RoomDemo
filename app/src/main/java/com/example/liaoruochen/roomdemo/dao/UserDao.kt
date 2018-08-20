package com.example.liaoruochen.roomdemo.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Update
import com.example.liaoruochen.roomdemo.entity.User

@Dao
interface UserDao {

    @Insert
    fun insert(vararg user: User)

    @Update
    fun update(vararg user:User)

    @Delete
    fun delete(vararg user: User)

}
package com.example.liaoruochen.roomdemo.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import android.arch.persistence.room.Transaction
import com.example.liaoruochen.roomdemo.entity.UserWithRepos

@Dao
interface UserWithReposDao {

    @Transaction
    @Query("SELECT * FROM user")
    fun getUsersWithRepos(): List<UserWithRepos>

}
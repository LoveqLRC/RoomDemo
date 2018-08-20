package com.example.liaoruochen.roomdemo.dao

import android.arch.persistence.room.*
import com.example.liaoruochen.roomdemo.entity.Repo

@Dao
interface RepoDao {
    @Query("SELECT * FROM repo")
    fun getAllRepos(): List<Repo>

    @Query("SELECT * FROM repo WHERE id =:id")
    fun getRepoById(id: Int): Repo


    @Query("SELECT * FROM repo WHERE name =:name")
    fun getReposByName(name: String): List<Repo>


    @Query("SELECT * FROM repo WHERE name=:name LIMIT :max")
    fun getReposByName(max: Int, vararg name: String): List<Repo>


    @Query("SELECT * FROM repo WHERE userId=:userId")
    fun findReposForUser(userId: Int): List<Repo>

    @Insert
    fun insert(vararg repos: Repo)

    @Insert
    fun insert(repo: Repo)

    @Insert
    fun insert(repos: List<Repo>)


    @Update
    fun update(vararg repos: Repo)


    @Delete
    fun delete(vararg repos: Repo)

}
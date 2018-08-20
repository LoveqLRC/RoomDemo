package com.example.liaoruochen.roomdemo.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.liaoruochen.roomdemo.entity.Repo
import com.example.liaoruochen.roomdemo.entity.User
import com.example.liaoruochen.roomdemo.entity.UserRepoJoin

@Dao
interface UserRepoJoinDao {

    @Insert
    fun insert(userRepoJoin: UserRepoJoin)


    @Query("SELECT * FROM user INNER JOIN  user_repo_join ON  user.id=user_repo_join.userId WHERE user_repo_join.repoId=:repoId")
    fun getUsersForRepos(repoId: Int): List<User>


    @Query("SELECT * FROM repo INNER JOIN user_repo_join ON repo.id =user_repo_join.repoId WHERE user_repo_join.userId=:userId")
    fun getReposForUsers(userId: Int): List<Repo>


}
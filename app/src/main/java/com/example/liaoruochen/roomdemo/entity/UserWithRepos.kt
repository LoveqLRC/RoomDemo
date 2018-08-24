package com.example.liaoruochen.roomdemo.entity

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Relation

class UserWithRepos {
    @Embedded
    var user: User? = null

    @Relation(parentColumn = "id", entityColumn = "userId")
    var repoList: List<Repo> = arrayListOf()


}
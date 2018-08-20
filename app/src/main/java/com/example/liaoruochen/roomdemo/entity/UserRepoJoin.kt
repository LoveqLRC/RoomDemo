package com.example.liaoruochen.roomdemo.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey

@Entity(tableName = "user_repo_join",
        primaryKeys = ["userId", "repoId"],
        foreignKeys = [
            ForeignKey(entity = User::class, parentColumns = ["id"], childColumns = ["userId"]),
            ForeignKey(entity = Repo::class, parentColumns = ["id"], childColumns = ["repoId"])
        ]
)
class UserRepoJoin(val userId: Int, val repoId: Int)
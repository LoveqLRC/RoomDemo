package com.example.liaoruochen.roomdemo.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
data class User(
        @PrimaryKey val id: Int,
        val login: String,
        val avatarUrl: String
)
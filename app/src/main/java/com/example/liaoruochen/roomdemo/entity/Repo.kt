package com.example.liaoruochen.roomdemo.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey

@Entity
data class Repo(
        @PrimaryKey
        val id :Int ,
        val name :String ,
        val url :String
)


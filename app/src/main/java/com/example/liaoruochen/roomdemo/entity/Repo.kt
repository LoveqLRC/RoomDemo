package com.example.liaoruochen.roomdemo.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.ForeignKey.CASCADE
import android.arch.persistence.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = User::class,parentColumns = ["id"],childColumns = ["userId"],onDelete = CASCADE)])
data class Repo(
        @PrimaryKey
        val id :Int ,
        val name :String ,
        val url :String,
        val userId:Int =1
)


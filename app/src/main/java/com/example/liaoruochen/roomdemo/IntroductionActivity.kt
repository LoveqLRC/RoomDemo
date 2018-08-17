package com.example.liaoruochen.roomdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.liaoruochen.roomdemo.db.RepoDatabase
import com.example.liaoruochen.roomdemo.entity.Repo
import com.example.liaoruochen.roomdemo.utilities.runOnIoThread

class IntroductionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)
    }


    fun getAllRepos(view: View) {
        runOnIoThread {

            var allRepos = RepoDatabase
                    .getInstance(this)
                    .getRepoDao().getAllRepos()

            Log.d("tag", allRepos.toString())
        }

    }


    fun getRepoById(view: View) {
        runOnIoThread {
            var repo = RepoDatabase
                    .getInstance(this)
                    .getRepoDao()
                    .getRepoById(1)
            Log.d("tag", repo.toString())
        }

    }

    fun getRepoByName(view: View) {
        runOnIoThread {
            var reposByName = RepoDatabase
                    .getInstance(this)
                    .getRepoDao()
                    .getReposByName("B")
            Log.d("tag", reposByName.toString())
        }


    }

    fun getRepoByName2(view: View) {
        runOnIoThread {
            var reposByName = RepoDatabase
                    .getInstance(this)
                    .getRepoDao()
                    .getReposByName(2, "B", "C", "D")
            Log.d("tag", reposByName.toString())
        }

    }

    fun addRepo(view: View) {

        runOnIoThread {
            RepoDatabase.getInstance(this)
                    .getRepoDao().insert(Repo(1, "A", "a"))
        }

    }

    fun addManyRepo(view: View) {
        runOnIoThread {
            RepoDatabase.getInstance(this)
                    .getRepoDao()
                    .insert(
                            Repo(2, "B", "b"),
                            Repo(3, "C", "c"))

        }

    }

    fun addManyRepo2(view: View) {
        runOnIoThread {
            RepoDatabase.getInstance(this)
                    .getRepoDao()
                    .insert(arrayListOf(
                            Repo(4, "D", "d"),
                            Repo(5, "E", "e"),
                            Repo(6, "F", "f")))
        }

    }

    fun update(view: View) {
        runOnIoThread {
            RepoDatabase.getInstance(this)
                    .getRepoDao()
                    .update(Repo(1,"今天也有开开心心","2018年08月17日15:51:40"))
        }

    }

    fun delete(view :View){
        runOnIoThread {
            RepoDatabase
                    .getInstance(this)
                    .getRepoDao()
                    .delete(Repo(1,"哎呀呀","2018年08月17日15:55:19"))
        }
    }


}

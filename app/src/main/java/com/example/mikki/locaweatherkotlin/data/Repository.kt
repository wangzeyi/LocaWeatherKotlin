package com.example.mikki.locaweatherkotlin.data

import android.arch.lifecycle.LiveData
import com.example.mikki.locaweatherkotlin.data.model.ListItem
import com.example.mikki.locaweatherkotlin.data.model.Location
import com.example.mikki.locaweatherkotlin.data.remote.RemoteDataSource
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.warn

class Repository:IRepository {
    private val tag = AnkoLogger("myTag")
    companion object {
        val remoteDataSource = RemoteDataSource()
    }
    override fun loadWeather(location: Location): LiveData<List<ListItem>>? {
        tag.warn { "repository+++++++++++++++++++++++++++" }
        return remoteDataSource.loadWeather(location)
    }
}
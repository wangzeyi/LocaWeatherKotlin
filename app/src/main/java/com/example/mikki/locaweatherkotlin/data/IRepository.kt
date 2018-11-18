package com.example.mikki.locaweatherkotlin.data

import android.arch.lifecycle.LiveData
import com.example.mikki.locaweatherkotlin.data.model.ListItem
import com.example.mikki.locaweatherkotlin.data.model.Location

interface IRepository {

    fun loadWeather(location: Location): LiveData<List<ListItem>>?

}
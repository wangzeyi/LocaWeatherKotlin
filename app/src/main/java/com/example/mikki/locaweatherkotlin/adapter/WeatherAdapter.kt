package com.example.mikki.locaweatherkotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mikki.locaweatherkotlin.R
import com.example.mikki.locaweatherkotlin.data.model.ListItem
import kotlinx.android.synthetic.main.item_weather.view.*

class WeatherAdapter:RecyclerView.Adapter<WeatherAdapter.ViewHolder>(){

    var weatherList = mutableListOf<ListItem>()

    fun setList(list: List<ListItem>){
        weatherList = list as MutableList<ListItem>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_weather, parent, false))
    }

    override fun getItemCount(): Int {
        return weatherList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var weatherItem = weatherList.get(position)
        holder.main.text = weatherItem!!.weather!!.get(0)!!.main

        var tempF:Int = ((9/5) * (weatherItem!!.main!!.temp!! - 273.15) + 32).toInt()
        holder.temp.text = tempF.toString() + 0x00B0
        var tempMinF:Int = ((9/5) * (weatherItem!!.main!!.tempMin!! - 273.15) + 32).toInt()
        holder.tempMin.text = tempMinF.toString() + 0x00B0
        var tempMaxF:Int = ((9/5) * (weatherItem!!.main!!.tempMax!! - 273.15) + 32).toInt()
        holder.tempMax.text = tempMaxF.toString() + 0x00B0

        holder.humidity.text = weatherItem!!.main!!.humidity.toString()
        holder.pressure.text = weatherItem!!.main!!.pressure.toString()
        holder.seaLevel.text = weatherItem!!.main!!.seaLevel.toString()
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var main = itemView.tv_category
        var temp = itemView.tv_temp
        var tempMin = itemView.tv_temp_min
        var tempMax = itemView.tv_temp_max
        var humidity = itemView.tv_humidity
        var pressure = itemView.tv_pressure
        var seaLevel = itemView.tv_sealevel
    }
}
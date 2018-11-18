package com.example.mikki.locaweatherkotlin.data.model

import com.google.gson.annotations.SerializedName

data class ListItem(

	@field:SerializedName("weather")
	val weather: List<WeatherItem?>? = null,

	@field:SerializedName("main")
	val main: Main? = null

)
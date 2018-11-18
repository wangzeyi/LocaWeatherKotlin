package com.example.mikki.locaweatherkotlin.data.model

import com.google.gson.annotations.SerializedName

data class WeatherItem(

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("main")
	val main: String? = null
)
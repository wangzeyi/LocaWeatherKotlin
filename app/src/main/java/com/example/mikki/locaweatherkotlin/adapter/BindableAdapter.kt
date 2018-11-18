package com.example.mikki.locaweatherkotlin.adapter

interface BindableAdapter<T> {
    fun setData(items: List<T>)
    fun changedPositions(positions: Int)
}
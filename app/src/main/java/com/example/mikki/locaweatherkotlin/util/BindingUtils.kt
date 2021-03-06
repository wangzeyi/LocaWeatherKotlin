package com.example.mikki.locaweatherkotlin.util

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.example.mikki.locaweatherkotlin.adapter.BindableAdapter

@BindingAdapter("data")
fun <T> setRecyclerViewProperties(recyclerView: RecyclerView, items: List<T>) {
    if (recyclerView.adapter is BindableAdapter<*>) {
        (recyclerView.adapter as BindableAdapter<T>).setData(items)
    }
}

@BindingAdapter("changedPositions")
fun <T> setDataChanged(recyclerView: RecyclerView, positions: Int) {
    if (recyclerView.adapter is BindableAdapter<*>) {
        (recyclerView.adapter as BindableAdapter<T>).changedPositions(positions)
    }
}
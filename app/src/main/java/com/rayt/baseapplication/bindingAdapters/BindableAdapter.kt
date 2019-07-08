package com.resdiary.plus.ui

import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.rayt.baseapplication.configurables.RecyclerViewConfiguration

interface BindableAdapter<T> {
    fun setData(data: T)
}

abstract class RecyclerBindingAdapter<R:ViewDataBinding,T> : RecyclerView.Adapter<BindableViewholder<R>>(), BindableAdapter<T>

@BindingAdapter("data")
fun <T> setRecyclerViewProperties(recyclerView: RecyclerView, items: T) {
    if (recyclerView.adapter is BindableAdapter<*>) {
        (recyclerView.adapter as BindableAdapter<T>).setData(items)
    }
}

@BindingAdapter("setRecyclerViewConfiguration")
fun <T> setupRecyclerView(recyclerView: RecyclerView, recyclerViewConfiguration: RecyclerViewConfiguration<T>){
    recyclerViewConfiguration.adapter?.let{adapter->
        recyclerViewConfiguration.data?.let{data->
            adapter.setData(data)
        }
        recyclerView.adapter = adapter
    }
    recyclerViewConfiguration.layoutManager?.let{layoutManager->
        recyclerView.layoutManager = layoutManager
    }

}

open class BindableViewholder<T:ViewDataBinding >(var bindable:T): RecyclerView.ViewHolder(bindable.root)

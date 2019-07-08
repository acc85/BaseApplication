package com.rayt.baseapplication.configurables

import androidx.recyclerview.widget.RecyclerView
import com.resdiary.plus.ui.BindableAdapter
import com.resdiary.plus.ui.RecyclerBindingAdapter

class RecyclerViewConfiguration<T>{

    var layoutManager : RecyclerView.LayoutManager? =null
    var adapter : RecyclerBindingAdapter<*,T>? = null
    var data : T? = null

}
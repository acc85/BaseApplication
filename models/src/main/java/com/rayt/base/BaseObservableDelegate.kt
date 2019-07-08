package com.rayt.base

import androidx.databinding.BaseObservable
import com.rayt.models.BR
import java.lang.RuntimeException
import kotlin.reflect.KProperty

class BaseObservableDelegate<T>(private var value: T,
                                private val observer: BaseObservable,
                                private val method: ((oldValue: T, newValue: T) -> Unit)? = null) {

    private var bindingTarget: Int = -1

    operator fun getValue(thisRef: Any?, p: KProperty<*>) = value

    operator fun setValue(thisRef: Any?, p: KProperty<*>, v: T) {

        val oldValue = value
        value = v
        if (bindingTarget == -1) {
            if(BR::class.java.fields.size > 0) {
                bindingTarget = BR::class.java.fields.filter {
                    it.name == p.name
                }.firstOrNull()?.getInt(null)?:-1
            }else{
                throw RuntimeException("Error trying to find Binding ID. Make sure attribute is Bindable")
            }
        }
        observer.notifyPropertyChanged(bindingTarget)
        method?.invoke(oldValue,value)
    }
}

fun <T> BaseObservable.bindDelegate(value: T): BaseObservableDelegate<T> =
        BaseObservableDelegate(value, this)
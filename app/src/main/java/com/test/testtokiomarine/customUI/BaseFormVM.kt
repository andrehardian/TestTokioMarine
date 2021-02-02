package com.test.testtokiomarine.customUI

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import java.lang.ref.WeakReference

open abstract class BaseFormVM<T,K> : ViewModel() {

    val labelObs = ObservableField<String>()
    val valueObs = ObservableField<String>()
    var listener: ((K) -> Unit)? = null

    private var navigator: WeakReference<T>? = null

    fun setNavigator(nav: T) {
        navigator = WeakReference(nav)
    }

    val getNavigator: T?
        get() {
            return navigator!!.get()
        }


    fun setLabel(label: String) {
        labelObs.set(label)
    }

    fun setValue(value: String) {
        valueObs.set(value)
    }

    val label: String?
        get() {
            return labelObs!!.get()
        }
    val value: String?
        get() {
            return valueObs!!.get()
        }

}
package com.test.testtokiomarine.ui.base

import androidx.lifecycle.ViewModel
import java.lang.ref.WeakReference

abstract class BaseVM<T> : ViewModel() {
    private var navigator: WeakReference<T>? = null

    fun setNavigator(nav: T) {
        navigator = WeakReference(nav)
        println(navigator)
    }

    val getNavigator: T?
        get() {
            return navigator!!.get()
        }
}
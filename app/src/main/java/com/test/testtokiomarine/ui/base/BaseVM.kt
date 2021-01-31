package com.test.testtokiomarine.ui.base

import androidx.lifecycle.ViewModel
import java.lang.ref.WeakReference

abstract class BaseVM<T> : ViewModel() {
    protected var navigator: WeakReference<T>? = null
    fun setNavigator(nav: T) {
        this.navigator = WeakReference(nav)
    }
}
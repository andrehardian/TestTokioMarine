package com.test.testtokiomarine.ui.fragment.form

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class FormViewModel : ViewModel() {
    val spinnerVisibility = MutableLiveData<Int>()
    val productInfoVisibility = MutableLiveData<Int>()

    fun listenerBirthDate(date: Date) {

    }

    init {
        spinnerVisibility.postValue(View.GONE)
        productInfoVisibility.postValue(View.GONE)
    }
}
package com.test.testtokiomarine.common

import android.widget.Spinner
import androidx.databinding.BindingAdapter
import com.test.testtokiomarine.common.SpinnerExtension.setSpinnerEntries

class SpinnerBinding {
    @BindingAdapter("entries")
    fun Spinner.setEntries(entries: List<Any>?) {
        setSpinnerEntries(entries)
    }
}
package com.test.testtokiomarine.common.spinner

import android.widget.Spinner
import androidx.databinding.BindingAdapter
import com.test.testtokiomarine.common.spinner.SpinnerExtension.setSpinnerEntries

class SpinnerBinding {
    @BindingAdapter("entries")
    fun Spinner.setEntries(entries: List<Any>?) {
        setSpinnerEntries(entries)
    }
}
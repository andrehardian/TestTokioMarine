package com.test.testtokiomarine.common.spinner

import android.widget.ArrayAdapter
import android.widget.Spinner

object SpinnerExtension {
    fun Spinner.setSpinnerEntries(entries: List<Any>?) {
        if (entries != null) {
            val arrayAdapter = ArrayAdapter(context,android.R.layout.simple_spinner_item,entries)
            arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            adapter = arrayAdapter
        }
    }
}
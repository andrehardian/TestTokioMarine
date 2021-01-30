package com.test.testtokiomarine.customUI.spinner

import android.content.Context
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseFormVM

class SpinnerVM<T>(context: Context, data: ArrayList<T>) : BaseFormVM() {
    var spinnerAdapter: ArrayAdapter<T>

    val click = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(p0: AdapterView<*>?) {
            TODO("Not yet implemented")
        }

        override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            value.set(p0!!.getItemAtPosition(p2) as String)
        }
    }

    fun setData(data: ArrayList<T>) {
        spinnerAdapter.clear()
        spinnerAdapter.addAll(data)
    }

    init {
        spinnerAdapter = ArrayAdapter<T>(
            context,
            R.layout.support_simple_spinner_dropdown_item,
            data
        )
    }

}
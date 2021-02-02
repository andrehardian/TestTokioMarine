package com.test.testtokiomarine.customUI.spinner

import android.view.View
import android.widget.AdapterView
import androidx.databinding.ObservableField
import com.test.testtokiomarine.customUI.BaseFormVM

class SpinnerVM<T> : BaseFormVM<Any, String>() {
    val items = ObservableField<List<String>>()

    val click = object : AdapterView.OnItemSelectedListener {
        override fun onNothingSelected(p0: AdapterView<*>?) {
            TODO("Not yet implemented")
        }

        override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            setValue(p0!!.getItemAtPosition(p2) as String)
            listener?.invoke(value!!)
        }
    }

    fun setData(data: List<String>) {
        items.set(data)
    }

}
package com.test.testtokiomarine.customUI.spinner

import android.content.Context
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.ObservableField
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseFormVM

class SpinnerVM<T>(context: Context) : BaseFormVM<Any, String>() {
    var spinnerAdapter: ArrayAdapter<T>
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

    fun setData(data: ArrayList<String>) {
        items.set(data)
/*
        spinnerAdapter.clear()
        spinnerAdapter.addAll(data)
        spinnerAdapter.notifyDataSetChanged()
*/
    }

    init {
       /* spinnerAdapter = ArrayAdapter<T>(
            context,
            R.layout.support_simple_spinner_dropdown_item,
            ArrayList()
        )*/
    }

}
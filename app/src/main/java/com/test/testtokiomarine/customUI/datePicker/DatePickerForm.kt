package com.test.testtokiomarine.customUI.datePicker

import android.app.DatePickerDialog
import android.content.Context
import android.util.AttributeSet
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.customUI.BaseFormPicker
import com.test.testtokiomarine.customUI.PickerNavigator
import com.test.testtokiomarine.databinding.DatePickBinding
import java.util.*

class DatePickerForm :
    BaseFormPicker<String, DatePickerVM, DatePickBinding>, PickerNavigator {
    override val vm: DatePickerVM
        get() = DatePickerVM()
    override val layoutId: Int
        get() = R.layout.date_pick

    constructor(context: Context) : super(context) {

    }


    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
    }

    override fun initFun() {
        viewModel!!.setNavigator(this)
    }

    override fun showPicker(calendar: Calendar) {
        DatePickerDialog(
            context,
            { datePicker, year, month, day ->
                viewModel!!.setDate(year, month, day)
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        ).show()
    }

}
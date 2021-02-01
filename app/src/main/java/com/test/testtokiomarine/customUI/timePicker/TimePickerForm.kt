package com.test.testtokiomarine.customUI.timePicker

import android.app.TimePickerDialog
import android.content.Context
import android.util.AttributeSet
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.customUI.BaseFormPicker
import com.test.testtokiomarine.customUI.PickerNavigator
import com.test.testtokiomarine.databinding.TimePickBinding
import java.util.*

class TimePickerForm :
    BaseFormPicker<String, TimePickerVM, TimePickBinding>, PickerNavigator {
    override val vm: TimePickerVM
        get() = TimePickerVM()
    override val layoutId: Int
        get() = R.layout.time_pick

    constructor(context: Context) : super(context) {

    }


    constructor(context: Context, data: String) : super(context, data) {

    }

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
    }

    override fun initFun() {
        viewModel!!.setNavigator(this)
    }

    override fun showPicker(calendar: Calendar) {
        TimePickerDialog(
            context,
            { timePicker, hour, minute -> viewModel!!.setTime(hour, minute) },
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            true
        ).show()
    }

}
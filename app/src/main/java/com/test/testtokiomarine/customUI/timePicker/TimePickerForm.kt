package com.test.testtokiomarine.customUI.timePicker

import android.content.Context
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.databinding.TimePickBinding

class TimePickerForm(context: Context, data: String) :
    BaseForm<String, TimePickerVM<String>, TimePickBinding>(context, data) {
    override val vm: TimePickerVM<String>
        get() = TimePickerVM()
    override val layoutId: Int
        get() = R.layout.time_pick
}
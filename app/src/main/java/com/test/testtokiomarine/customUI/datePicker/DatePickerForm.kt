package com.test.testtokiomarine.customUI.datePicker

import android.content.Context
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.databinding.DatePickBinding

class DatePickerForm(context: Context, data: String) :
    BaseForm<String, DatePickerVM<String>,DatePickBinding>(context, data) {
    override val vm: DatePickerVM<String>
        get() = DatePickerVM()
    override val layoutId: Int
        get() = R.layout.date_pick
}
package com.test.testtokiomarine.customUI.datePicker

import com.test.testtokiomarine.customUI.BasePickerVM
import java.text.SimpleDateFormat

class DatePickerVM : BasePickerVM() {
    fun setDate(year: Int, month: Int, day: Int) {
        calendar.set(year, month, day)
        setValue(SimpleDateFormat("yyyy-MM-dd").format(calendar.time))
        listener?.let { it(calendar) }
    }

    init {
        setValue("Tap to set")
    }
}
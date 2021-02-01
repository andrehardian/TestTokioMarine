package com.test.testtokiomarine.customUI.timePicker

import com.test.testtokiomarine.customUI.BasePickerVM
import java.text.SimpleDateFormat
import java.util.*

class TimePickerVM : BasePickerVM() {
    fun setTime(hour: Int, minute: Int) {
        calendar.set(Calendar.HOUR, hour)
        calendar.set(Calendar.MINUTE, minute)
        setValue(SimpleDateFormat("HH:mm").format(calendar.time))
    }

    init {
        setValue("Tap to set")
    }

}
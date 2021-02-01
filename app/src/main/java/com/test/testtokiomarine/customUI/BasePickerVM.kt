package com.test.testtokiomarine.customUI

import java.util.*

open class BasePickerVM : BaseFormVM<PickerNavigator, Date>() {
    val calendar = Calendar.getInstance()

    fun click() {
        getNavigator?.showPicker(calendar)
    }

}
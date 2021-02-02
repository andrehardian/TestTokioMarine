package com.test.testtokiomarine.fact.form

import android.content.Context
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.customUI.datePicker.DatePickerForm
import com.test.testtokiomarine.customUI.freeText.FreeTextForm
import com.test.testtokiomarine.customUI.multiLine.MultiLineForm
import com.test.testtokiomarine.customUI.spinner.SpinnerForm
import com.test.testtokiomarine.customUI.timePicker.TimePickerForm

abstract class FormFactory {
    companion object {
        @JvmStatic
        fun getForm(
            formType: String,
            context: Context,
            label: String,
            data: Any?
        ): BaseForm<*, *, *, *>? {
            when (formType) {
                FormType.FREE_TEXT -> {
                    return FreeTextForm(context).setLabel(label).setData(data as String)
                }
                FormType.MULTI_LINE -> {
                    return MultiLineForm(context).setLabel(label).setData(data as String)
                }
                FormType.SINGLE_OPTION -> {
                    return SpinnerForm(context).setLabel(label).setData(data as List<String>)
                }
                FormType.DATE_PICK -> {
                    return DatePickerForm(context).setLabel(label).setData(data as String)
                }
                FormType.TIME_PICK -> {
                    return TimePickerForm(context).setLabel(label).setData(data as String)
                }
                else -> return null;
            }
        }
    }
}
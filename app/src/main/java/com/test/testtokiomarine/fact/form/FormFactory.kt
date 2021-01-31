package com.test.testtokiomarine.fact.form

import android.content.Context
import com.test.testtokiomarine.customUI.Form
import com.test.testtokiomarine.customUI.datePicker.DatePickerForm
import com.test.testtokiomarine.customUI.freeText.FreeTextForm
import com.test.testtokiomarine.customUI.multiLine.MultiLineForm
import com.test.testtokiomarine.customUI.spinner.SpinnerForm
import com.test.testtokiomarine.customUI.timePicker.TimePickerForm

abstract class FormFactory {
    companion object {
        @JvmStatic
        fun getForm(formType: String, context: Context, data: Any): Form<*>? {
            when (formType) {
                FormType.FREE_TEXT -> {
                    return FreeTextForm(context, data = data as String)
                }
                FormType.MULTI_LINE -> {
                    return MultiLineForm(context, data = data as String)
                }
                FormType.SINGLE_OPTION -> {
                    return SpinnerForm(context, data = data as ArrayList<String>)
                }
                FormType.DATE_PICK -> {
                    return DatePickerForm(context, data = data as String)
                }
                FormType.TIME_PICK -> {
                    return TimePickerForm(context, data = data as String)
                }
                else -> return null;
            }
        }
    }
}
package com.test.testtokiomarine.ui.fragment.form

import android.content.Context
import com.test.testtokiomarine.common.AdditionalType
import com.test.testtokiomarine.customUI.BaseForm

interface FormNavigator {
    fun setDataSpinnerProduct(data: ArrayList<String>)
    fun addView(type: AdditionalType, form: BaseForm<*, *, *, *>)
    fun deleteAllView(type: AdditionalType)
    fun getContext(): Context?
}
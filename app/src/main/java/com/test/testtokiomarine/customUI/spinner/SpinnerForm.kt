package com.test.testtokiomarine.customUI.spinner

import android.content.Context
import android.util.AttributeSet
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.databinding.SpinnerFormBinding

class SpinnerForm :
    BaseForm<ArrayList<String>, String, SpinnerVM<String>, SpinnerFormBinding> {
    override val vm: SpinnerVM<String>
        get() = SpinnerVM(context)
    override val layoutId: Int
        get() = R.layout.spinner_form

    constructor(context: Context) : super(context) {

    }

    constructor(context: Context, data: ArrayList<String>) : super(context, data) {

    }

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
    }


}
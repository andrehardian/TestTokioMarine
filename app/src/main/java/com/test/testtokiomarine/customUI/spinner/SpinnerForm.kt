package com.test.testtokiomarine.customUI.spinner

import android.content.Context
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.databinding.SpinnerFormBinding

class SpinnerForm(context: Context, val data: ArrayList<String>) :
    BaseForm<ArrayList<String>, SpinnerVM<String>, SpinnerFormBinding>(context, data) {

    override val vm: SpinnerVM<String>
        get() = SpinnerVM(context, data)
    override val layoutId: Int
        get() = R.layout.spinner_form

}
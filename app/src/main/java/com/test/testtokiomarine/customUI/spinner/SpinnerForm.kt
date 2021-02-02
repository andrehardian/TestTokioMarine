package com.test.testtokiomarine.customUI.spinner

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.databinding.SpinnerFormBinding

class SpinnerForm :
    BaseForm<List<String>, String, SpinnerVM<String>, SpinnerFormBinding> {
    override val vm: SpinnerVM<String>
        get() = SpinnerVM(context)
    override val layoutId: Int
        get() = R.layout.spinner_form

    constructor(context: Context) : super(context) {

    }


    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
    }

    override fun setData(data: List<String>): BaseForm<List<String>, String, SpinnerVM<String>, SpinnerFormBinding> {
        viewModel!!.setData(data)
        return this
    }

    override fun setInput(typedArray: TypedArray) {
        super.setInput(typedArray)
        val id = typedArray.getResourceId(R.styleable.BaseForm_entries, 0)
        if (id > 0)
            setData(resources.getStringArray(id).asList())
    }

}
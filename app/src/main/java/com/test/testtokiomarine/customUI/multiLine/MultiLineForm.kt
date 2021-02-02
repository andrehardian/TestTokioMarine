package com.test.testtokiomarine.customUI.multiLine

import android.content.Context
import android.util.AttributeSet
import com.test.testtokiomarine.BR
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.databinding.MultiLineTextBinding

class MultiLineForm :
    BaseForm<String,String, MultiLineVM<String>, MultiLineTextBinding> {
    override val vm: MultiLineVM<String>
        get() = MultiLineVM()
    override val layoutId: Int
        get() = R.layout.multi_line_text

    constructor(context: Context) : super(context) {

    }


    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
    }


}
package com.test.testtokiomarine.customUI.multiLine

import android.content.Context
import com.test.testtokiomarine.BR
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.databinding.MultiLineTextBinding

class MultiLineForm(context: Context, data: String) :
    BaseForm<String, MultiLineVM<String>, MultiLineTextBinding>(context, data) {
    override val vm: MultiLineVM<String>
        get() = MultiLineVM()
    override val layoutId: Int
        get() = R.layout.multi_line_text

}
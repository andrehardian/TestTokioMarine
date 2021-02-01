package com.test.testtokiomarine.customUI.freeText

import android.content.Context
import android.util.AttributeSet
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.databinding.FreeTextBinding

class FreeTextForm :
    BaseForm<String, String, FreeTextVM, FreeTextBinding> {
    override val vm: FreeTextVM
        get() = FreeTextVM()
    override val layoutId: Int
        get() = R.layout.free_text


    constructor(context: Context) : super(context) {

    }

    constructor(context: Context, data: String) : super(context, data) {

    }

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
    }


}
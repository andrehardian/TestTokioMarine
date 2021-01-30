package com.test.testtokiomarine.customUI.freeText

import android.content.Context
import com.test.testtokiomarine.R
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.databinding.FreeTextBinding

class FreeTextForm(context: Context, data: String) :
    BaseForm<String, FreeTextVM<String>, FreeTextBinding>(context, data) {
    override val vm: FreeTextVM<String>
        get() = FreeTextVM()
    override val layoutId: Int
        get() = R.layout.free_text
}
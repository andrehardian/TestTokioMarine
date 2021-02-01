package com.test.testtokiomarine.customUI

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.Nullable
import androidx.databinding.ViewDataBinding
import java.util.*

abstract class BaseFormPicker<DATA, VM : BaseFormVM<*, Date>, BINDING : ViewDataBinding> :
    BaseForm<DATA, Date, VM, BINDING> {
    constructor(context: Context) : super(context) {

    }

    constructor(context: Context, @Nullable data: DATA?) : super(context) {
    }

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {

    }
}
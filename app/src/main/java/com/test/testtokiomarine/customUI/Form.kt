package com.test.testtokiomarine.customUI

import android.content.res.TypedArray
import androidx.databinding.ViewDataBinding

interface Form<DATA, RESULT, VM : BaseFormVM<*, RESULT>,BINDING : ViewDataBinding> {
    fun getData(): String
    fun setLabel(label: String): BaseForm<DATA, RESULT, VM,BINDING>
    fun setData(data: DATA): BaseForm<DATA, RESULT, VM,BINDING>
    fun setListener(listener: (RESULT)->Unit)
    fun initFun()
    fun setInput(typedArray: TypedArray)
}
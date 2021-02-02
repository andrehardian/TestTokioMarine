package com.test.testtokiomarine.customUI

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.test.testtokiomarine.BR
import com.test.testtokiomarine.R

abstract class BaseForm<DATA, RESULT, VM : BaseFormVM<*, RESULT>, BINDING : ViewDataBinding> :
    LinearLayout,
    Form<DATA, RESULT, VM, BINDING> {
    @get:LayoutRes
    abstract val layoutId: Int
    var vdb: BINDING
    private var data: DATA? = null
    abstract val vm: VM?
    var viewModel: VM? = null

    constructor(context: Context) : super(context) {

    }

    val getData: DATA?
        get() {
            return data;
        }

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.BaseForm, 0, 0)
        if (typedArray != null) {
            setInput(typedArray)
            typedArray!!.recycle()
        }
    }

    override fun setInput(typedArray: TypedArray) {
        typedArray!!.getString(R.styleable.BaseForm_label)?.let { setLabel(it) }
    }

    override fun getData(): String {
        return viewModel!!.value!!
    }

    override fun setData(data: DATA?): BaseForm<DATA, RESULT, VM, BINDING> {
        if (data is String)
            viewModel!!.setValue(data)
        return this
    }

    override fun setLabel(label: String): BaseForm<DATA, RESULT, VM, BINDING> {
        viewModel!!.setLabel(label)
        return this
    }

    init {
        viewModel = vm
        val layoutInflater =
            LayoutInflater.from(context)
        vdb = DataBindingUtil.inflate(
            layoutInflater
            , layoutId, this, true
        )

        vdb.setVariable(BR.vmCustom, viewModel)
        initFun()
    }


    override fun initFun() {

    }

    override fun setListener(listener: (RESULT) -> Unit) {
        viewModel!!.listener = listener
    }

    override fun getLabel(): String {
        return viewModel!!.label!!
    }


}
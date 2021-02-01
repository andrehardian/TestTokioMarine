package com.test.testtokiomarine.customUI

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.LayoutRes
import androidx.annotation.Nullable
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.test.testtokiomarine.BR
import com.test.testtokiomarine.R

abstract class BaseForm<DATA,RESULT, VM : BaseFormVM<*, RESULT>, BINDING : ViewDataBinding> :
    LinearLayout,
    Form<DATA,RESULT> {
    @get:LayoutRes
    abstract val layoutId: Int
    var vdb: BINDING
    private var data: DATA? = null
    abstract val vm: VM?
    var viewModel: VM? = null

    constructor(context: Context) : super(context) {

    }

    constructor(context: Context, @Nullable data: DATA?) : super(context) {
        this.data = data
    }

    val getData: DATA?
        get() {
            return data;
        }

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.BaseForm, 0, 0)
        if (typedArray != null) {
            typedArray!!.getString(R.styleable.BaseForm_label)?.let { setLabel(it) }
            typedArray!!.recycle()
        }
    }

    override fun getData(): String {
        return viewModel!!.value!!
    }

    override fun setData(data: DATA) {
        if (data is String)
            viewModel!!.setValue(data)
    }

    override fun setLabel(label: String) {
        viewModel!!.setLabel(label)
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


}
package com.test.testtokiomarine.customUI

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.test.testtokiomarine.BR
import com.test.testtokiomarine.R

abstract class BaseForm<DATA, VM : BaseFormVM, binding : ViewDataBinding> :
    LinearLayout,
    Form<DATA> {
    abstract val vm: VM
    abstract val layoutId: Int
    var vdb: binding
    lateinit var typedArray: TypedArray

    constructor(context: Context, data: DATA) : super(context) {

    }

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.BaseForm, 0, 0)
    }

    override fun getData(): String {
        return vm.value.get().toString()
    }

    override fun setData(data: DATA) {
        if (data is String)
            vm.value.set(data as String)
    }

    override fun setLabel(label: String) {
        vm.label.set(label)
    }

    init {
        val layoutInflater =
            context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater;
        vdb = DataBindingUtil.inflate<binding>(
            layoutInflater
            , layoutId, this, false
        )

        vdb.setVariable(BR._all, vm)
        typedArray.getString(R.styleable.BaseForm_label)?.let { setLabel(it) }
    }

    override fun setListener(listener: (String) -> Unit) {
        vm.listener = listener
    }
}
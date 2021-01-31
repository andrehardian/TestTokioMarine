package com.test.testtokiomarine.customUI

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.test.testtokiomarine.BR

abstract class BaseForm<DATA, VM : BaseFormVM, binding : ViewDataBinding>(
    context: Context,
    data: DATA
) :
    LinearLayout(context),
    Form<DATA> {
    abstract val vm: VM
    abstract val layoutId: Int
     var vdb: binding

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
    }

    override fun setListener(listener: (String) -> Unit) {
        vm.listener = listener
    }
}
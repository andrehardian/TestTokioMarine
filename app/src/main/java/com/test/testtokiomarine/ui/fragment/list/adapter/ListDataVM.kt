package com.test.testtokiomarine.ui.fragment.list.adapter

import androidx.databinding.ObservableField
import com.test.testtokiomarine.databinding.AdapterListDataBinding
import com.test.testtokiomarine.model.data.ModelLeads
import java.util.*

class ListDataVM(
    itemData: ModelLeads?, var actionDetail: (ModelLeads, AdapterListDataBinding) -> Unit,
    var binding: AdapterListDataBinding
) : Observable() {

    val name = ObservableField<String>()

    var data: ModelLeads? = itemData

    init {
        name.set(data?.name)
    }

    fun goDetail() {
//        ViewCompat.setTransitionName(binding.oval, "oval")
//        ViewCompat.setTransitionName(binding.tvCompanyName, "companyName")
//        ViewCompat.setTransitionName(binding.tvName, "name")
        with(binding) {
            executePendingBindings()
        }
        actionDetail(data!!, binding)
    }

}
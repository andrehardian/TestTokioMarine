package com.test.testtokiomarine.ui.fragment.list.adapter

import androidx.databinding.ObservableField
import com.test.testtokiomarine.databinding.AdapterListDataBinding
import com.test.testtokiomarine.model.data.ModelLeads
import java.util.*

class ListDataVM(
    itemData: ModelLeads?,
    var actionDetail: (ModelLeads, AdapterListDataBinding) -> Unit,
    var actionDelete: (ModelLeads) -> Unit,
    var binding: AdapterListDataBinding
) : Observable() {

    val name = ObservableField<String>()
    val birthDate = ObservableField<String>()
    val updateAt = ObservableField<String>()
    val productName = ObservableField<String>()

    var data: ModelLeads? = itemData

    init {
        name.set(data?.modelLeads?.name)
        birthDate.set(data?.modelLeads?.dateOfBirth)
        updateAt.set(data?.modelLeads?.updateAt)
        productName.set(data?.productInfo?.product)
    }

    fun goDetail() {
        actionDetail(data!!, binding)
    }

    fun delete() {
        actionDelete(data!!)
    }

}
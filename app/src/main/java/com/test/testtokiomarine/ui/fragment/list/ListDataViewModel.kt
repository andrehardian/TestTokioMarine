package com.test.testtokiomarine.ui.fragment.list

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.test.testtokiomarine.databinding.AdapterListDataBinding
import com.test.testtokiomarine.model.data.ModelLeads
import com.test.testtokiomarine.ui.fragment.list.adapter.ListDataAdapter

class ListDataViewModel : ViewModel() {
    var search = ObservableField<String>()
    var isEmpty = ObservableBoolean(true)
    var isLoadingLoadMore = false
    var adapter = ListDataAdapter(ArrayList(), ::detail)

    fun detail(modelLeads: ModelLeads, binding: AdapterListDataBinding) {

    }
}
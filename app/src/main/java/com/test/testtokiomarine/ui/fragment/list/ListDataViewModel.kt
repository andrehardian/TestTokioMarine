package com.test.testtokiomarine.ui.fragment.list

import android.text.Editable
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
    var adapter = ListDataAdapter(ArrayList(), ::detail, ::delete)

    init {

    }

    fun afterTextChange(s: Editable) {
        search.set(s.toString())
        getData();
    }

    fun add() {

    }

    private fun getData() {

    }

    fun detail(modelLeads: ModelLeads, binding: AdapterListDataBinding) {
        detal(modelLeads)
    }

    private fun detal(modelLeads: ModelLeads) {
        TODO("Not yet implemented")
    }

    fun delete(modelLeads: ModelLeads) {

    }
}
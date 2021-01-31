package com.test.testtokiomarine.ui.fragment.list

import android.text.Editable
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.test.testtokiomarine.databinding.AdapterListDataBinding
import com.test.testtokiomarine.model.data.ModelLeads
import com.test.testtokiomarine.ui.base.BaseVM
import com.test.testtokiomarine.ui.fragment.list.adapter.ListDataAdapter
import java.lang.ref.WeakReference

class ListDataViewModel : BaseVM<ListDataNavigator >() {
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
        detail(null)
    }

    private fun getData() {

    }

    fun detail(modelLeads: ModelLeads, binding: AdapterListDataBinding) {
        detail(modelLeads)
    }

    private fun detail(modelLeads: ModelLeads?) {
        navigator!!.get()!!.showDetail(modelLeads)
    }

    fun delete(modelLeads: ModelLeads) {

    }
}
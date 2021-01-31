package com.test.testtokiomarine.ui.fragment.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.testtokiomarine.databinding.AdapterListDataBinding
import com.test.testtokiomarine.model.data.ModelLeads
import com.test.testtokiomarine.ui.base.BaseAdapter

class ListDataAdapter(
    dataList: ArrayList<ModelLeads>,
    action: (ModelLeads, AdapterListDataBinding) -> Unit,
    delete: (ModelLeads) -> Unit
) : BaseAdapter<ModelLeads>(dataList) {
    private lateinit var binding: AdapterListDataBinding
    private val action: (ModelLeads, AdapterListDataBinding) -> Unit = action
    private val delete: (ModelLeads) -> Unit = delete
    override fun createHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding =
            AdapterListDataBinding.inflate(LayoutInflater.from(parent.context), parent, false);
        return GenericViewHolder(binding)
    }

    override fun bindingViewHolder(holder: GenericViewHolder, position: Int) {
        if (holder.viewDataBinding is AdapterListDataBinding) {
            (holder.viewDataBinding as AdapterListDataBinding).vmAdapterData =
                ListDataVM(
                    listData.get(position), action,
                    delete, binding
                )
        }
    }
}
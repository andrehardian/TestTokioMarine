package com.test.testtokiomarine.ui.fragment.list

import android.os.Bundle
import androidx.annotation.Nullable
import androidx.navigation.fragment.findNavController
import com.test.testtokiomarine.BR
import com.test.testtokiomarine.R
import com.test.testtokiomarine.databinding.ListDataFragmentBinding
import com.test.testtokiomarine.model.data.ModelLeads
import com.test.testtokiomarine.ui.base.BaseFragment

class ListDataFragment : BaseFragment<ListDataFragmentBinding, ListDataViewModel>(),
    ListDataNavigator {
    override val bindingVariable: Int
        get() = BR.vmList
    override val layoutId: Int
        get() = R.layout.list_data_fragment
    override val viewModel: ListDataViewModel
        get() = ListDataViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel!!.setNavigator(this)
    }

    override fun showDetail(@Nullable modelLeads: ModelLeads?) {
        findNavController().navigate(R.id.action_list_data_to_detail, Bundle().apply {
            putSerializable("data_leads", modelLeads)
        })
    }
}
package com.test.testtokiomarine.ui.fragment.list

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.testtokiomarine.BR
import com.test.testtokiomarine.R
import com.test.testtokiomarine.databinding.ListDataFragmentBinding
import com.test.testtokiomarine.ui.base.BaseFragment

class ListDataFragment : BaseFragment<ListDataFragmentBinding, ListDataViewModel>() {
    override val bindingVariable: Int
        get() = BR.vmList
    override val layoutId: Int
        get() = R.layout.list_data_fragment
    override val viewModel: ListDataViewModel
        get() = ListDataViewModel()


}
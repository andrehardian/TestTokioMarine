package com.test.testtokiomarine.ui.fragment.form

import android.content.Context
import android.os.Bundle
import android.view.View
import com.test.testtokiomarine.BR
import com.test.testtokiomarine.R
import com.test.testtokiomarine.databinding.FormFragmentBinding
import com.test.testtokiomarine.fact.product.ProductPackage
import com.test.testtokiomarine.model.data.ModelLeads
import com.test.testtokiomarine.ui.base.BaseFragment

class FormFragment : BaseFragment<FormFragmentBinding, FormViewModel>(), FormNavigator {
    override val bindingVariable: Int
        get() = BR.vmForm
    override val layoutId: Int
        get() = R.layout.form_fragment
    override val viewModel: FormViewModel
        get() = FormViewModel()

    private var leads: ModelLeads? = null

/*
    companion object {
        const val KEY = "id_data"
        fun newInstance(id: Long) = FormFragment()
            .apply {
                arguments = Bundle().apply {
                    putLong(KEY, id)
                }
            }
    }
*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel!!.setNavigator(this)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        leads = FormFragmentArgs.fromBundle(requireArguments()).dataLeads
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewDataBinding!!.birthDate.setListener(mViewModel!!::listenerBirthDate)
        viewDataBinding!!.spinnerProduct.setListener(mViewModel!!::listenerSpinnerProduct)
    }

    override fun setDataSpinnerProduct(data: ArrayList<String>) {
        viewDataBinding!!.spinnerProduct.setData(data)
    }


}
package com.test.testtokiomarine.ui.fragment.form

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.test.testtokiomarine.BR
import com.test.testtokiomarine.Injection
import com.test.testtokiomarine.R
import com.test.testtokiomarine.common.AdditionalType
import com.test.testtokiomarine.customUI.BaseForm
import com.test.testtokiomarine.databinding.FormFragmentBinding
import com.test.testtokiomarine.model.data.ModelLeads
import com.test.testtokiomarine.ui.base.BaseFragment

class FormFragment : BaseFragment<FormFragmentBinding, FormViewModel>(), FormNavigator {

    override val bindingVariable: Int
        get() = BR.vmForm
    override val layoutId: Int
        get() = R.layout.form_fragment

    val viewModel: FormViewModel by viewModels { vmFactory }


    private var leads: ModelLeads? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vmFactory = Injection.provideViewModelFactory(requireContext())
        vm = viewModel
        viewModel!!.setNavigator(this)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        leads = FormFragmentArgs.fromBundle(requireArguments()).dataLeads
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel!!.setData(leads!!, viewDataBinding!!.group)

        viewDataBinding!!.birthDate.setListener(viewModel!!::listenerBirthDate)
        viewDataBinding!!.spinnerProduct.setListener(viewModel!!::listenerSpinnerProduct)
        viewDataBinding!!.spinnerActType.setListener(viewModel!!::listenerSpinnerActivityType)
    }

    override fun setDataSpinnerProduct(data: ArrayList<String>) {
        viewDataBinding!!.spinnerProduct.setData(data)
    }

    override fun addView(type: AdditionalType, form: BaseForm<*, *, *, *>) {
        when (type) {
            AdditionalType.ADDITIONAL_PRODUCT -> {
                viewDataBinding!!.additionalProduct.addView(form)
            }
            AdditionalType.ADDITIONAL_TYPE -> {
                viewDataBinding!!.additionalType.addView(form)
            }
            AdditionalType.ADDITIONAL_DETAIL -> {
                viewDataBinding!!.additionalDetail.addView(form)
            }
        }
    }

    override fun deleteAllView(type: AdditionalType) {
        when (type) {
            AdditionalType.ADDITIONAL_PRODUCT -> {
                viewDataBinding!!.additionalProduct.removeAllViews()
            }
            AdditionalType.ADDITIONAL_TYPE -> {
                viewDataBinding!!.additionalType.removeAllViews()
            }
            AdditionalType.ADDITIONAL_DETAIL -> {
                viewDataBinding!!.additionalDetail.removeAllViews()
            }
        }
    }

    override fun getContext(): Context? {
        return super.getContext()
    }




}
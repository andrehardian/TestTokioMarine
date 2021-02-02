package com.test.testtokiomarine.ui.fragment.form

import android.content.Context
import android.os.Bundle
import android.view.View
import com.test.testtokiomarine.BR
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
    override val viewModel: FormViewModel
        get() = FormViewModel()

    private var leads: ModelLeads? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel!!.setNavigator(this)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        leads = FormFragmentArgs.fromBundle(requireArguments()).dataLeads
        viewModel!!.setData(leads!!,viewDataBinding!!.group)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewDataBinding!!.birthDate.setListener(mViewModel!!::listenerBirthDate)
        viewDataBinding!!.spinnerProduct.setListener(mViewModel!!::listenerSpinnerProduct)
        viewDataBinding!!.spinnerActType.setListener(mViewModel!!::listenerSpinnerActivityType)
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
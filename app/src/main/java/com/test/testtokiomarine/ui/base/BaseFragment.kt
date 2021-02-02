package com.test.testtokiomarine.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.test.testtokiomarine.ui.VMFactory

abstract class BaseFragment<VDB : ViewDataBinding, VM : ViewModel> : Fragment() {
    private var baseActivity: BaseActivity? = null
    private var rootView: View? = null
    var viewDataBinding: VDB? = null
        private set
    lateinit var vmFactory: VMFactory

    abstract val bindingVariable: Int
    lateinit var vm: VM

    @get:LayoutRes
    abstract val layoutId: Int


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = DataBindingUtil.inflate<VDB>(inflater, layoutId, container, false)
        rootView = viewDataBinding!!.root
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewDataBinding!!.setVariable(bindingVariable, vm)
        viewDataBinding!!.lifecycleOwner = this
        viewDataBinding!!.executePendingBindings()
    }
}
package com.test.testtokiomarine.common

import androidx.databinding.DataBindingComponent
import com.test.testtokiomarine.common.spinner.SpinnerBinding

class BindingComponent : DataBindingComponent {
    override fun getSpinnerBinding(): SpinnerBinding {
        return SpinnerBinding()
    }

}
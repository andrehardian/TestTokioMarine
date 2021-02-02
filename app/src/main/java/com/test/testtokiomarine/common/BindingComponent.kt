package com.test.testtokiomarine.common

import androidx.databinding.DataBindingComponent

class BindingComponent:DataBindingComponent {
    override fun getSpinnerBinding(): SpinnerBinding {
        return SpinnerBinding()
    }
}
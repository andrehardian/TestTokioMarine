package com.test.testtokiomarine.customUI

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

open abstract class BaseFormVM : ViewModel() {
    val label = ObservableField<String>()
    val value = ObservableField<String>()
}
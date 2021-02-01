package com.test.testtokiomarine.ui.fragment.list

import androidx.annotation.Nullable
import com.test.testtokiomarine.model.data.ModelLeads

interface ListDataNavigator {
    fun showDetail(@Nullable modelLeads: ModelLeads?)
}
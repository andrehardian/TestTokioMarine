package com.test.testtokiomarine.ui.fragment.list

import com.test.testtokiomarine.model.data.ModelLeads

interface ListDataNavigator {
    fun showDetail(modelLeads: ModelLeads?)
}
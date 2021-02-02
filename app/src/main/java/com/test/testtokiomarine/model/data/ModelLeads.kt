package com.test.testtokiomarine.model.data

import java.io.Serializable

open class ModelLeads(
    val modelLeads: Leads = Leads(),
    val productInfo: ProductInfo = ProductInfo()
) :
    Serializable {
}
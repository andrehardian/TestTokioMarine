package com.test.testtokiomarine.fact.product

class ProductB :ProductPackage {
    override fun minAge(): Int {
       return 25
    }

    override fun maxAge(): Int {
       return 50
    }

    override fun getName(): String {
        return ProductType.PRODUCT_B
    }
}

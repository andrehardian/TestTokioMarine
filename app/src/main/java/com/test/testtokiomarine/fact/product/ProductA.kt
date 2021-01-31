package com.test.testtokiomarine.fact.product

class ProductA :ProductPackage {
    override fun minAge(): Int {
        return 18;
    }

    override fun maxAge(): Int {
        return 23
    }

    override fun getName(): String {
        return ProductType.PRODUCT_A
    }
}

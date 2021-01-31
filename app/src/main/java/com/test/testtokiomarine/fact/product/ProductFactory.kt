package com.test.testtokiomarine.fact.product

abstract class ProductFactory {
    companion object {
        @JvmStatic
        fun getProduct(productType: String): ProductPackage? {
            when (productType) {
                ProductType.PRODUCT_A -> {
                    return ProductA()
                }
                ProductType.PRODUCT_B -> {
                    return ProductB()
                }
                else -> return null;
            }
        }
    }
}
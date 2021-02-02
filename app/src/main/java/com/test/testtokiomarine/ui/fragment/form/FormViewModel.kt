package com.test.testtokiomarine.ui.fragment.form

import android.view.View
import androidx.lifecycle.MutableLiveData
import com.test.testtokiomarine.fact.product.ProductFactory
import com.test.testtokiomarine.fact.product.ProductType
import com.test.testtokiomarine.ui.base.BaseVM
import java.util.*
import kotlin.collections.ArrayList

class FormViewModel : BaseVM<FormNavigator>() {
    val spinnerVisibility = MutableLiveData<Int>()
    val productInfoVisibility = MutableLiveData<Int>()

    fun listenerBirthDate(calendar: Calendar) {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val birthYear = calendar.get(Calendar.YEAR)
        val age = /*currentYear - birthYear*/21
        val listProduct: ArrayList<String> = ArrayList()
        val types = arrayOf(ProductType.PRODUCT_A, ProductType.PRODUCT_B)
        for (type in types) {
            val product = ProductFactory.getProduct(type)
            if (product!!.minAge() <= age && product!!.maxAge() >= age)
                listProduct.add(product.getName())
        }

        getNavigator?.setDataSpinnerProduct(listProduct)

        if (listProduct.size > 0) {
            spinnerVisibility.postValue(View.VISIBLE)
        }
    }

    fun listenerSpinnerProduct(result: String) {

    }

    init {
        spinnerVisibility.postValue(View.VISIBLE)
        productInfoVisibility.postValue(View.GONE)
    }
}
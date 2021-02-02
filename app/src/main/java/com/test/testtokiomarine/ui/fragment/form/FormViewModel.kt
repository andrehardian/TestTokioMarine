package com.test.testtokiomarine.ui.fragment.form

import android.view.View
import androidx.lifecycle.MutableLiveData
import com.test.testtokiomarine.common.ActivityType
import com.test.testtokiomarine.common.AdditionalType
import com.test.testtokiomarine.fact.form.FormFactory
import com.test.testtokiomarine.fact.form.FormType
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
        val age = currentYear - birthYear
        val listProduct: ArrayList<String> = ArrayList()
        listProduct.add("Select Product")
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
        deleteAllAdditionalView()
        if (result.equals(ProductType.PRODUCT_A) || result.equals(ProductType.PRODUCT_B)) {
            productInfoVisibility.postValue(View.VISIBLE)
            when (result) {
                ProductType.PRODUCT_A -> {
                    addView(
                        FormType.FREE_TEXT,
                        "Product Code",
                        "",
                        AdditionalType.ADDITIONAL_PRODUCT
                    )
                    addView(
                        FormType.DATE_PICK,
                        "Plan to Start",
                        "Tap to Set",
                        AdditionalType.ADDITIONAL_DETAIL
                    )
                    addView(FormType.FREE_TEXT, "Reason", "", AdditionalType.ADDITIONAL_DETAIL)
                }
                ProductType.PRODUCT_B -> {
                    addView(FormType.FREE_TEXT, "Price", "", AdditionalType.ADDITIONAL_DETAIL)
                    addView(
                        FormType.SINGLE_OPTION,
                        "How Long",
                        arrayOf("12 Bulan", "24 Bulan", "36 Bulan", "48 Bulan").toList(),
                        AdditionalType.ADDITIONAL_DETAIL
                    )
                }
            }
        } else {
            productInfoVisibility.postValue(View.GONE)
        }
    }

    private fun deleteAllAdditionalView() {
        getNavigator?.deleteAllView(AdditionalType.ADDITIONAL_TYPE)
        getNavigator?.deleteAllView(AdditionalType.ADDITIONAL_DETAIL)
        getNavigator?.deleteAllView(AdditionalType.ADDITIONAL_PRODUCT)
    }

    fun listenerSpinnerActivityType(result: String) {
        when (result) {
            ActivityType.MEETING -> {
                addView(FormType.FREE_TEXT, "Place", "", AdditionalType.ADDITIONAL_TYPE)
            }
            else -> {
                getNavigator?.deleteAllView(AdditionalType.ADDITIONAL_TYPE)
            }
        }
    }

    private fun addView(
        formType: String,
        label: String,
        data: Any,
        additionalType: AdditionalType
    ) {
        getNavigator?.getContext()?.let {
            FormFactory.getForm(formType, it, label, data)?.let {
                getNavigator?.addView(
                    additionalType,
                    it
                )
            }
        }
    }

    fun save(){

    }

    init {
        spinnerVisibility.postValue(View.GONE)
        productInfoVisibility.postValue(View.GONE)
    }
}
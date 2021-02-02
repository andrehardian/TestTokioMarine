package com.test.testtokiomarine.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.test.testtokiomarine.db.LeadsDao
import com.test.testtokiomarine.ui.fragment.form.FormViewModel
import com.test.testtokiomarine.ui.fragment.list.ListDataViewModel

class VMFactory(private val datasource: LeadsDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(FormViewModel::class.java) -> {
                FormViewModel(datasource) as T
            }

            modelClass.isAssignableFrom(ListDataViewModel::class.java) -> {
                ListDataViewModel(datasource) as T
            }
            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }

}
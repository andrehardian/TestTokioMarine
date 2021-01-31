package com.test.testtokiomarine.customUI

interface Form<K> {
    fun getData(): String
    fun setLabel(label: String)
    fun setData(data: K)
    fun setListener(listener: (String)->Unit)
}
package com.test.testtokiomarine.customUI

interface Form<K,RESULT> {
    fun getData(): String
    fun setLabel(label: String)
    fun setData(data: K)
    fun setListener(listener: (RESULT)->Unit)
    fun initFun()
}
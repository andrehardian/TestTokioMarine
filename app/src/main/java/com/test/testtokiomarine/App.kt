package com.test.testtokiomarine

import android.app.Application
import androidx.databinding.DataBindingUtil
import com.test.testtokiomarine.common.BindingComponent

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        DataBindingUtil.setDefaultComponent(BindingComponent())
    }
}
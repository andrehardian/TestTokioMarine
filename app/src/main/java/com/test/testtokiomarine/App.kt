package com.test.testtokiomarine

import android.app.Application
import androidx.databinding.DataBindingUtil
import com.test.testtokiomarine.common.BindingComponent
import io.realm.Realm

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)

        DataBindingUtil.setDefaultComponent(BindingComponent())
    }
}
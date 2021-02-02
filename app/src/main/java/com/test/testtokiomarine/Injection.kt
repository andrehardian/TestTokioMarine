package com.test.testtokiomarine

import android.content.Context
import com.test.testtokiomarine.db.LeadsDB
import com.test.testtokiomarine.db.LeadsDao
import com.test.testtokiomarine.ui.VMFactory

object Injection {

    fun provideLeadsDataSource(context: Context): LeadsDao {
        val database = LeadsDB.getInstance(context)
        return database.leadsDao()
    }

    fun provideViewModelFactory(context: Context): VMFactory {
        val dataSource = provideLeadsDataSource(context)
        return VMFactory(dataSource)
    }
}
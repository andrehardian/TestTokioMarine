package com.test.testtokiomarine.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.test.testtokiomarine.model.data.Leads
import com.test.testtokiomarine.model.data.ProductInfo

@Database(entities = [Leads::class, ProductInfo::class], version = 1)
abstract class LeadsDB : RoomDatabase() {
    abstract fun leadsDao(): LeadsDao

    companion object {
        @Volatile
        private var INSTANCE: LeadsDB? = null
        fun getInstance(context: Context): LeadsDB = INSTANCE ?: synchronized(this) {
            INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext, LeadsDB::class.java, "leads.db")
                .build()
    }


}
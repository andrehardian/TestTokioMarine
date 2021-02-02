package com.test.testtokiomarine.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.test.testtokiomarine.model.data.Leads
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface LeadsDao {
    @Query("Select * From leads")
    fun getAllLeads(): Flowable<List<Leads>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLeads(modelLeads: Leads): Completable

    @Query("Delete From leads Where id=:leadsId")
    fun delete(leadsId: Long)

}
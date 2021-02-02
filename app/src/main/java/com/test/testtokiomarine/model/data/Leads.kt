package com.test.testtokiomarine.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "leads")
class Leads(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = -1,
    @ColumnInfo(name = "name")
    var name: String? = null,
    @ColumnInfo(name = "date_of_birth")
    var dateOfBirth: String? = null,
    @ColumnInfo(name = "create_at")
    var createdAt: String? = null,
    @ColumnInfo(name = "update_at")
    var updateAt: String? = null
) : Serializable {

}
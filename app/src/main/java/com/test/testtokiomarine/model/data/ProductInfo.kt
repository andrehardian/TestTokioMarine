package com.test.testtokiomarine.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(
    tableName = "product",
    foreignKeys = (arrayOf(
        ForeignKey(
            entity = Leads::class,
            onUpdate = ForeignKey.CASCADE,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("leadsId")
        )
    ))
)
open class ProductInfo(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = -1,
    @ColumnInfo(name = "product")
    var product: String? = null,
    @ColumnInfo(name = "leadsId")
    var leadsId: Long = -1,
    @ColumnInfo(name = "product_Id")
    var productId: Int? = -1,
    @ColumnInfo(name = "activity_type")
    var activityType: String? = null,
    @ColumnInfo(name = "activity_type_id")
    var activityTypeId: Int? = null,
    @ColumnInfo(name = "date")
    var date: String? = null,
    @ColumnInfo(name = "time_start")
    var timeStart: String? = null,
    @ColumnInfo(name = "time_end")
    var timeEnd: String? = null,
    @ColumnInfo(name = "notes")
    var notes: String? = null,
    @ColumnInfo(name = "place")
    var place: String? = null,
    @ColumnInfo(name = "price")
    var price: String? = null,
    @ColumnInfo(name = "reason")
    var reason: String? = null,
    @ColumnInfo(name = "how_long")
    var howLong: String? = null,
    @ColumnInfo(name = "product_code")
    var productCode: String? = null
) : Serializable {
}
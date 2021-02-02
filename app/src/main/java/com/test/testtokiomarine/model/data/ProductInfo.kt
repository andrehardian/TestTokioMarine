package com.test.testtokiomarine.model.data

import io.realm.RealmObject
import io.realm.annotations.RealmClass
import java.io.Serializable

@RealmClass
open class ProductInfo(
    var product: String? = null,
    var productId: Int? = -1,
    var activityType: String? = null,
    var activityTypeId: Int? = null,
    var date: String? = null,
    var timeStart: String? = null,
    var timeEnd: String? = null,
    var notes: String? = null,
    var place: String? = null,
    var price: String? = null,
    var reason: String? = null,
    var howLong: String? = null,
    var productCode: String? = null
) : RealmObject(), Serializable {
}
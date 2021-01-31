package com.test.testtokiomarine.model.data

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class ModelLeads(
    @PrimaryKey
    var id: Long? = -1,
    var name: String? = null,
    var dateOfBirth: String? = null,
    var productInfo: ProductInfo? = null
) :
    RealmObject() {

}
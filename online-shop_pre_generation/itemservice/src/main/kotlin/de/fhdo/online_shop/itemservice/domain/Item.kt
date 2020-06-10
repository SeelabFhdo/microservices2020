package de.fhdo.online_shop.itemservice.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Item (
        @Id var id : String?,
        var itemname : String,
        var description : String,
        var price : Float
)
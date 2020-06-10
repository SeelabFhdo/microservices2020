package de.fhdo.online_shop.orderservice.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class ItemDTO (
        @Id var id : String?,
        var itemname : String,
        var description : String,
        var price : Float
)
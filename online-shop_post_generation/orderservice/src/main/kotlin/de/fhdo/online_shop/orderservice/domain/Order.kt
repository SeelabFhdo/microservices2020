package de.fhdo.online_shop.orderservice.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Order (
        @Id var id: String?,
        var customerId: Long,
        var itemId: String,
        var orderStatus: OrderStatus
)

enum class OrderStatus {
    CREATED, PAYED, SHIPPED
}
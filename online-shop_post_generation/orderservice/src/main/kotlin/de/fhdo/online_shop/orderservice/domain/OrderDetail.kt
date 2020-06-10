package de.fhdo.online_shop.orderservice.domain

class OrderDetail(
        var orderId: String,
        var customerDTO: CustomerDTO,
        var itemDTO: ItemDTO
)
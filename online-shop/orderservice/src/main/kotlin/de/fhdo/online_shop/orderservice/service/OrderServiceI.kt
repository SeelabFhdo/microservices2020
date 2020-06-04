package de.fhdo.online_shop.orderservice.service

import de.fhdo.online_shop.orderservice.domain.Order

interface OrderServiceI {
    fun saveOrder(order: Order): Order
    fun readOrder(id: String) : Order
    fun readAllOrder(): List<Order>
    fun updateOrder(order: Order): Order
    fun deleteOrder(order: Order)
}
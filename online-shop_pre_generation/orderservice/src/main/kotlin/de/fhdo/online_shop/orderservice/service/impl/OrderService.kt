package de.fhdo.online_shop.orderservice.service.impl

import de.fhdo.online_shop.orderservice.domain.Order
import de.fhdo.online_shop.orderservice.repository.OrderRepositoryI
import de.fhdo.online_shop.orderservice.service.OrderServiceI
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class OrderService : OrderServiceI {
    @Autowired
    lateinit var orderRepository: OrderRepositoryI

    override fun saveOrder(order: Order): Order {
        return orderRepository.save(order)
    }

    override fun readOrder(id: String): Order {
        return orderRepository.findById(id).orElseGet(null)
    }

    override fun readAllOrder(): List<Order> {
        return orderRepository.findAll().toList()
    }

    override fun updateOrder(order: Order): Order {
        return orderRepository.save(order)
    }

    override fun deleteOrder(order: Order) {
        orderRepository.delete(order)
    }
}
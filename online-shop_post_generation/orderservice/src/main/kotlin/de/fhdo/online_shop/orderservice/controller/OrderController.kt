package de.fhdo.online_shop.orderservice.controller

import de.fhdo.online_shop.orderservice.consumer.CustomerRestConsumerI
import de.fhdo.online_shop.orderservice.consumer.ItemRestConsumerI
import de.fhdo.online_shop.orderservice.domain.Order
import de.fhdo.online_shop.orderservice.domain.OrderDetail
import de.fhdo.online_shop.orderservice.service.OrderServiceI
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/resources/v1"], produces = ["application/json"])
class OrderController {
    @Autowired
    lateinit var orderService: OrderServiceI

    @Autowired
    lateinit var customerRestConsumer: CustomerRestConsumerI

    @Autowired
    lateinit var itemRestConsumer: ItemRestConsumerI

    @GetMapping(path = ["/order/{id}"])
    fun readOrder(@PathVariable id: String): Order {
        return orderService.readOrder(id)
    }

    @GetMapping(path = ["/orders"])
    fun readAllOrders(): List<Order> {
        return orderService.readAllOrder()
    }

    @PostMapping(path = ["/order"], consumes = ["application/json"])
    fun createOder(@RequestBody order: Order): Order {
        return orderService.saveOrder(order)
    }

    @PutMapping(path = ["/order"], consumes = ["application/json"])
    fun updateOrder(@RequestBody order: Order): Order {
        return orderService.updateOrder(order)
    }

    @DeleteMapping(path = ["/order"], consumes = ["application/json"])
    fun deleteOrder(@RequestBody order: Order) {
        orderService.deleteOrder(order)
    }

    @GetMapping(path = ["/order/{id}/details"])
    fun getOrderDetails(@PathVariable id: String): OrderDetail {
        val order = orderService.readOrder(id)

        return OrderDetail(orderService.readOrder(id).id.toString(),
                customerRestConsumer.getCustomerById(order.customerId),
                itemRestConsumer.getItemById(order.itemId))
    }
}
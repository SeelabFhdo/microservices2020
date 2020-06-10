package de.fhdo.online_shop.orderservice.consumer

import de.fhdo.online_shop.orderservice.domain.ItemDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "itemservice")
interface ItemRestConsumerI {
    @GetMapping(value = ["/resources/v1/item/{id}"])
    fun getItemById(@PathVariable id: String): ItemDTO
}
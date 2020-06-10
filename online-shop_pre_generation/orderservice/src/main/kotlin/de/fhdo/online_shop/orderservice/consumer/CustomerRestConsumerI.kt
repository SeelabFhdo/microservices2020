package de.fhdo.online_shop.orderservice.consumer

import de.fhdo.online_shop.orderservice.domain.CustomerDTO
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "CustomerService")
interface CustomerRestConsumerI {
    @GetMapping(value = ["/resources/v1/customer/{id}"])
    fun getCustomerById(@PathVariable id: Long): CustomerDTO
}

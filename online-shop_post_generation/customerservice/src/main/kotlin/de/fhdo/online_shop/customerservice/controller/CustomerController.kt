package de.fhdo.online_shop.customerservice.controller

import de.fhdo.online_shop.customerservice.domian.Customer
import de.fhdo.online_shop.customerservice.service.CustomerServiceI
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
class CustomerController {
    @Autowired
    lateinit var customerService: CustomerServiceI

    @GetMapping(path = ["/customers"])
    fun readAllCustomer(): List<Customer> {
        return customerService.readAllCustomer()
    }

    @GetMapping(path = ["/customer/{id}"])
    fun readCustomerById(@PathVariable id : Long): Customer {
        return customerService.readCustomer(id)
    }

    @PostMapping(path = ["/customer"], consumes = ["application/json"])
    fun createCustomer(@RequestBody customer: Customer): Customer {
        return customerService.saveCustomer(customer)
    }

    @PutMapping(path = ["/customer"], consumes = ["application/json"])
    fun updateCustomer(@RequestBody customer: Customer): Customer {
        return customerService.updateCustomer(customer)
    }

    @DeleteMapping(path = ["/customer"], consumes = ["application/json"])
    fun deleteCustomer(@RequestBody customer: Customer) {
        customerService.deleteCustomer(customer)
    }
}
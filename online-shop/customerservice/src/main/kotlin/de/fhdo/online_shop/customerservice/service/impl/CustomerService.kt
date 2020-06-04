package de.fhdo.online_shop.customerservice.service.impl

import de.fhdo.online_shop.customerservice.domian.Customer
import de.fhdo.online_shop.customerservice.repository.CustomerRepositoryI
import de.fhdo.online_shop.customerservice.service.CustomerServiceI
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService : CustomerServiceI {
    @Autowired
    lateinit var customerRepository: CustomerRepositoryI

    override fun readCustomer(id: Long): Customer {
        return customerRepository.findById(id).orElseGet(null)
    }

    override fun readAllCustomer(): List<Customer> {
        return customerRepository.findAll().toList()
    }

    override fun saveCustomer(customer: Customer): Customer {
        return customerRepository.save(customer)
    }

    override fun updateCustomer(customer: Customer): Customer {
        return customerRepository.save(customer)
    }

    override fun deleteCustomer(customer: Customer) {
        customerRepository.delete(customer)
    }
}
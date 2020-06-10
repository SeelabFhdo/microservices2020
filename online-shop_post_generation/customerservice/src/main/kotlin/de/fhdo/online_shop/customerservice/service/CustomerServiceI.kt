package de.fhdo.online_shop.customerservice.service

import de.fhdo.online_shop.customerservice.domian.Customer

interface CustomerServiceI  {
    fun readCustomer(id : Long): Customer
    fun readAllCustomer(): List<Customer>
    fun saveCustomer(customer : Customer): Customer
    fun updateCustomer(customer: Customer): Customer
    fun deleteCustomer(customer: Customer)
}
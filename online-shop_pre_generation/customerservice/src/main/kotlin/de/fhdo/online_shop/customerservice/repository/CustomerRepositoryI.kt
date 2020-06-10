package de.fhdo.online_shop.customerservice.repository

import de.fhdo.online_shop.customerservice.domian.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepositoryI : CrudRepository<Customer, Long>
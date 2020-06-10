package de.fhdo.online_shop.orderservice.repository

import de.fhdo.online_shop.orderservice.domain.Order
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepositoryI : CrudRepository<Order, String>
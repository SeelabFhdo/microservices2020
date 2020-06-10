package de.fhdo.online_shop.itemservice.repository

import de.fhdo.online_shop.itemservice.domain.Item
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepositoryI : CrudRepository<Item, String>

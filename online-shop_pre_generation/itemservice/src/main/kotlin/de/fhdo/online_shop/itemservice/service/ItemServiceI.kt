package de.fhdo.online_shop.itemservice.service

import de.fhdo.online_shop.itemservice.domain.Item

interface ItemServiceI {
    fun readItem(id : String): Item
    fun readAllItems(): List<Item>
    fun saveItem(item : Item): Item
    fun updateItem(item : Item): Item
    fun deleteItem(item : Item)
}
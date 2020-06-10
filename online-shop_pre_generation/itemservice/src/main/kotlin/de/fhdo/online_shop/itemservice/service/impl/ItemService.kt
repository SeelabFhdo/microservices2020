package de.fhdo.online_shop.itemservice.service.impl

import de.fhdo.online_shop.itemservice.domain.Item
import de.fhdo.online_shop.itemservice.repository.ItemRepositoryI
import de.fhdo.online_shop.itemservice.service.ItemServiceI
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ItemService : ItemServiceI {
    @Autowired
    lateinit var itemRepository: ItemRepositoryI

    override fun readItem(id: String): Item {
        return itemRepository.findById(id).orElseGet(null)
    }

    override fun readAllItems(): List<Item> {
        return itemRepository.findAll().toList()
    }

    override fun saveItem(item: Item): Item {
        return itemRepository.save(item)
    }

    override fun updateItem(item: Item): Item {
        return itemRepository.save(item)
    }

    override fun deleteItem(item: Item) {
        itemRepository.delete(item)
    }

}
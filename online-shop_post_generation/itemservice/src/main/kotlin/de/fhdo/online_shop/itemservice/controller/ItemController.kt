package de.fhdo.online_shop.itemservice.controller


import de.fhdo.online_shop.itemservice.domain.Item
import de.fhdo.online_shop.itemservice.service.ItemServiceI
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
class ItemController {
    @Autowired
    lateinit var itemService: ItemServiceI

    @GetMapping(path = ["/items"])
    fun readAllItems(): List<Item> {
        return itemService.readAllItems()
    }

    @GetMapping(path = ["/item/{id}"])
    fun readItem(@PathVariable id: String): Item {
        return itemService.readItem(id)
    }

    @PostMapping(path = ["/item"], consumes = ["application/json"])
    fun createItem(@RequestBody item: Item): Item {
        return itemService.saveItem(item)
    }

    @PutMapping(path = ["/item"], consumes = ["application/json"])
    fun updateItem(@RequestBody item: Item): Item {
        return itemService.updateItem(item)
    }

    @DeleteMapping(path = ["/item"], consumes = ["application/json"])
    fun deleteItem(@RequestBody item: Item) {
        itemService.deleteItem(item)
    }
}
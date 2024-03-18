package com.generico.app.item.controller;

import com.generico.app.item.models.Item;
import com.generico.app.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    @Qualifier("serviceRestTemplate") // This annotation is used to inject a bean by name , before: @Qualifier("serviceFeign")
    private ItemService itemService;

    @GetMapping("/listar")
    public List<Item> listar() {
        return itemService.findAll();
    }

    @GetMapping("/ver/{id}/cantidad/{quantity}")
    public Item detalle(@PathVariable Long id,@PathVariable Integer quantity) {
        return itemService.findById(id, quantity);
    }
}

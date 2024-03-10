package com.generico.app.item.service;

import com.generico.app.item.models.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer quantity);

}

package com.generico.app.item.client;

import com.generico.app.item.models.Item;
import com.generico.app.item.models.Product;
import com.generico.app.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("serviceFeign")
@Primary
public class ItemServiceFeign implements ItemService {

    @Autowired
    private ProductClientRest clientFeign;
    @Override
    public List<Item> findAll() {
        return clientFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer quantity) {
        return new Item(clientFeign.ver(id), quantity);
    }
}

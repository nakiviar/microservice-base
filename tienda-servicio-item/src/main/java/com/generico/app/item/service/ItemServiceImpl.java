package com.generico.app.item.service;

import com.generico.app.item.AppConfig;
import com.generico.app.item.models.Item;
import com.generico.app.item.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service("serviceRestTemplate")
public class ItemServiceImpl implements ItemService{


    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Item> findAll() {
        List<Product> prods = Arrays.asList(clienteRest.getForObject("http://service-products/listar", Product[].class));
        return prods.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
    }

    @Override
    public Item findById(Long id, Integer quantity) {
        Map<String, String> pathVariables = new HashMap<>();
        pathVariables.put("id", id.toString());
        Product product = clienteRest.getForObject("http://service-products/ver/{id}", Product.class, pathVariables);
        return new Item(product, quantity);
    }
}

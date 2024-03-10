package com.generico.app.item.client;

import com.generico.app.item.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "service-products", url = "localhost:8001")
public interface ProductClientRest {

    @GetMapping("/listar")
    public List<Product> listar();

    @GetMapping("/ver/{id}")
    public Product ver(@PathVariable Long id);
}

package com.generico.app.tienda.productos.controller;

import com.generico.app.tienda.productos.models.Product;
import com.generico.app.tienda.productos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController // This annotation is used to create RESTful web services using Spring MVC
public class ProductController {

    @Autowired
    private Environment env;
    @Autowired
    private IProductService productService;

    @GetMapping("/listar")
    public List<Product> listar() {
        return productService.findAll().stream().map(prod -> {
            prod.setPort(Integer.parseInt(env.getProperty("local.server.port")));
            return prod;
        }).collect(Collectors.toList());
    }

    @GetMapping("/ver/{id}")
    public Product ver(@PathVariable Long id) {
        Product product = productService.findById(id);
        product.setPort(Integer.parseInt(env.getProperty("local.server.port")));
        return product;
    }

}

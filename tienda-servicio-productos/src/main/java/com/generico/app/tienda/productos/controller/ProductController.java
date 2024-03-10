package com.generico.app.tienda.productos.controller;

import com.generico.app.tienda.productos.models.Product;
import com.generico.app.tienda.productos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // This annotation is used to create RESTful web services using Spring MVC
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/listar")
    public List<Product> listar() {
        return productService.findAll();
    }

    @GetMapping("/ver/{id}")
    public Product ver(@PathVariable Long id) {
        return productService.findById(id);
    }

}

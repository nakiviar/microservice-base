package com.generico.app.tienda.productos.service;

import com.generico.app.tienda.productos.models.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll();
    public Product findById(Long id);
}

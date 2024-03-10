package com.generico.app.tienda.productos.dao;

import com.generico.app.tienda.productos.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Product, Long> {

}

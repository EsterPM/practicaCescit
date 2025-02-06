package com.practica.tienda.practica_tienda.service;

import com.practica.tienda.practica_tienda.model.dto.ProductoDto;
import com.practica.tienda.practica_tienda.model.entity.Producto;

public interface IProducto {

    Producto save(Producto producto);

    ProductoDto findById(Integer id);

    void delete(Producto producto);
}

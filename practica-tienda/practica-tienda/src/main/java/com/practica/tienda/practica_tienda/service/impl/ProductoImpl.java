package com.practica.tienda.practica_tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practica.tienda.practica_tienda.model.dao.ProductoDao;
import com.practica.tienda.practica_tienda.model.dto.ProductoDto;
import com.practica.tienda.practica_tienda.model.dto.VarianteProductoDto;
import com.practica.tienda.practica_tienda.model.entity.Producto;
import com.practica.tienda.practica_tienda.service.IProducto;

@Service
public class ProductoImpl implements IProducto {

    @Autowired
    private ProductoDao productoDao;

    @Transactional
    @Override
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }

    @Transactional(readOnly = true)
    @Override
    public ProductoDto findById(Integer id) {
        // Buscar el producto en la base de datos
        Producto producto = productoDao.findById(id).orElse(null);

        return ProductoDto.builder()
            .productoId(producto.getProductoId())
            .nombre(producto.getNombre())
            .variantes(producto.getVariantes().stream()
                .map(VarianteProductoDto::fromEntity)
                .toList())
            .build();
    }

    @Transactional
    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

}

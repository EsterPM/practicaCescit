package com.practica.tienda.practica_tienda.model.dao;

import com.practica.tienda.practica_tienda.model.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Integer> {

}

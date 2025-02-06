package com.practica.tienda.practica_tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.practica.tienda.practica_tienda.model.dto.ProductoDto;
import com.practica.tienda.practica_tienda.model.entity.Producto;
import com.practica.tienda.practica_tienda.service.IProducto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1")
public class ProductoController {

    @Autowired
    private IProducto productoService;

    @PostMapping("producto") 
    @ResponseStatus(HttpStatus.CREATED) 
    public Producto create(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @PutMapping("producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto update(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    /*@DeleteMapping("/producto/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Integer id) {
        Producto productoDelete = productoService.findById(id);
        productoService.delete(productoDelete);
    }*/

    @GetMapping("/producto/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductoDto showById(@PathVariable("id") Integer id) {
        return productoService.findById(id);
    }
}

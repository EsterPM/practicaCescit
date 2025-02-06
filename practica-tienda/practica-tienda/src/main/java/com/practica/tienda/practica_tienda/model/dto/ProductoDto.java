package com.practica.tienda.practica_tienda.model.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@Builder
public class ProductoDto implements Serializable {
    private Integer productoId;
    private String nombre;
    private List<VarianteProductoDto> variantes;
}

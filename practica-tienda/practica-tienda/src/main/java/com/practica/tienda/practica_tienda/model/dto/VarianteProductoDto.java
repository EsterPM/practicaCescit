package com.practica.tienda.practica_tienda.model.dto;

import lombok.*;

import java.io.Serializable;

import com.practica.tienda.practica_tienda.model.entity.Stock;
import com.practica.tienda.practica_tienda.model.entity.VarianteProducto;

@Data
@ToString
@Builder
public class VarianteProductoDto implements Serializable {
    private Integer varianteId;
    private String talla;
    private String color;
    private Integer stockTotal;

    public static VarianteProductoDto fromEntity(VarianteProducto variante) {
        return VarianteProductoDto.builder()
                .varianteId(variante.getVarianteId())
                .talla(variante.getTalla().getTipoTalla())
                .color(variante.getColor().getNombreColor())
                .stockTotal(variante.getStock().stream().mapToInt(Stock::getCantidad).sum())
                .build();
    }
}

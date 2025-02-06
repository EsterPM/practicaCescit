package com.practica.tienda.practica_tienda.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table (name = "producto")
public class Producto implements Serializable {
    @Id
    @Column(name="producto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productoId;

    @Column(name="nombre")
    private String nombre;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="categoria")
    private String categoria;

    @Column(name="preciobase")
    private float precioBase;

    @OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
    private List<VarianteProducto> variantes;
}

package com.practica.tienda.practica_tienda.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "stock")
public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stockId;

    @ManyToOne
    @JoinColumn(name = "variante_id", nullable = false)
    private VarianteProducto varianteProducto;

    @Column(name="cantidad")
    private Integer cantidad;
}
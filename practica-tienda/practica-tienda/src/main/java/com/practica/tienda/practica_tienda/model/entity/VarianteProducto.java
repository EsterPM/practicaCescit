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
@Table (name = "variante_producto")
public class VarianteProducto implements Serializable {
    @Id
    @Column(name="variante_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer varianteId;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "talla_id", nullable = false)
    private Talla talla;

    @ManyToOne
    @JoinColumn(name = "color_id", nullable = false)
    private Color color;

    @OneToMany(mappedBy = "varianteProducto", fetch = FetchType.LAZY)
    private List<Stock> stock;
}

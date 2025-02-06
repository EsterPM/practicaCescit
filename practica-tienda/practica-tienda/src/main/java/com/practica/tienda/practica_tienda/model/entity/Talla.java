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
@Table (name = "talla")
public class Talla implements Serializable {

    @Id
    @Column(name="talla_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tallaId;

    @Column(name="talla")
    private String tipoTalla;
}

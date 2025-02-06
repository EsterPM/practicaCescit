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
@Table (name = "color")
public class Color implements Serializable {
    @Id
    @Column(name="color_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer colorId;

    @Column(name="nombrecolor")
    private String nombreColor;
}

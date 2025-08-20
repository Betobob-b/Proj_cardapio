package com.bepp.cardapio.food;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name = "foods")
@Entity(name = "foods")

public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    @Column(precision = 14, scale = 2, nullable = false)
    private BigDecimal price;

}

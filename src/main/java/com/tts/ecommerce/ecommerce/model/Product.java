package com.tts.ecommerce.ecommerce.model;

import java.math.BigDecimal;

// import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getters and setters automatically
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "product_id")
    private Long id;
    private String name;
    private String brand;
    private String category;
    private String description;
    private int quantity;
    private BigDecimal price;
    private String image;
}

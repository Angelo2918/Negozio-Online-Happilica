package com.Angelin.models;

import com.Angelin.enums.FoodsCategory;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "foods")
@Data
@NoArgsConstructor
public class Foods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private FoodsCategory category;
    @Column(nullable = false)
    private int stockQuantity;

    @JsonManagedReference
    @OneToMany(mappedBy = "foods", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    @ManyToMany(mappedBy = "wishlist")
    private Set<User> users = new HashSet<>();
}
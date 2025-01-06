package com.Angelin.services;

import com.Angelin.models.Foods;

import java.util.List;

public interface FoodsService {
    List<Foods> getAllFoods();

    Foods findFoodsById(Long id);

    Foods createFoods(Foods foods);

    void updateFoodsStock(Long id,Integer quantity);
}

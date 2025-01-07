package com.Angelin.services.impl;


import com.Angelin.models.Food;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodService {

    List<Food> getAllFoods();

    Food findFoodById(Long id);

    Food createFood(Food food);

    void updateFoodStock(Long id, Integer quantity);

    List<Food> getAllFood();
}


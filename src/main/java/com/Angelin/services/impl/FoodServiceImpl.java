package com.Angelin.services.impl;

import com.Angelin.models.Food;
import com.Angelin.repositories.FoodRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
    private final FoodRepository foodRepository;

    @Autowired
    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Food findFoodById(Long id) {
        return foodRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Food not found"));
    }

    public Food createFood(Food food) {
        if (food.getStockQuantity() < 0) {
            throw new IllegalArgumentException("Stock Quantity cannot be negative!");
        }

        return foodRepository.save(food);
    }

    public void updateFoodStock(Long id, Integer quantity) {
        Food food = findFoodById(id);
        if (food == null) {
            throw new EntityNotFoundException("Food with id: " + id + " cannot be found!");
        }

        food.setStockQuantity(quantity);
        foodRepository.save(food);
    }

    @Override
    public List<Food> getAllFood() {
        return List.of();
    }
}
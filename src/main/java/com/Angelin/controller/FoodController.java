package com.Angelin.controller;

import com.Angelin.models.Food;
import com.Angelin.services.impl.FoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {
    private final FoodService foodService;

    public FoodController(FoodService service) {
        this.foodService = service;
    }

    @GetMapping
    public ResponseEntity<List<Food>> getAllFoods() {
        return ResponseEntity.ok(foodService.getAllFood());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> getFoodsById(@PathVariable Long id) {
        return ResponseEntity.ok(foodService.findFoodById(id));
    }

    @PostMapping
    public ResponseEntity<Object> createFoods(@RequestBody Food food) {
        Food createdFood = foodService.createFood(food);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFood);
    }

    public FoodService getFoodService() {
        return foodService;
    }
}
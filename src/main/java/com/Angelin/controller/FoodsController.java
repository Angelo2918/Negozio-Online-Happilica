package com.Angelin.controller;

import com.Angelin.models.Foods;
import com.Angelin.services.FoodsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodsController {
    private final FoodsService foodsService;

    public FoodsController(FoodsService service, FoodsService foodsService) {
        this.foodsService = foodsService;
    }
    @GetMapping
    public ResponseEntity<List<Foods>> getAllFoods(){
        return ResponseEntity.ok(foodsService.getAllFoods());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Foods> getFoodsById(@PathVariable Long id){
        return ResponseEntity.ok(foodsService.findFoodsById(id));
    }
    @PostMapping
    public ResponseEntity<Foods> createFoods(@RequestBody Foods foods){
        Foods createdFoods = foodsService.createFoods(foods);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFoods);
    }
}

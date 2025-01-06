package com.Angelin.services.impl;

import com.Angelin.models.Foods;
import com.Angelin.services.FoodsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodsServiceImpl implements FoodsService {


    @Override
    public List<Foods> getAllFoods() {
        return List.of();
    }

    @Override
    public Foods findFoodsById(Long id) {
        return null;
    }

    @Override
    public Foods createFoods(Foods foods) {
        return null;
    }

    @Override
    public void updateFoodsStock(Long id, Integer quantity) {

    }
}
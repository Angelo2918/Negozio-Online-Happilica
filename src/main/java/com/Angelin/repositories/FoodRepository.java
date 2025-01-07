package com.Angelin.repositories;

import com.Angelin.enums.FoodCategory;
import com.Angelin.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * This interface represents a repository for managing food items. It extends JpaRepository
 * and provides methods for querying food items by category, price range, and stock quantity.
 */
@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findByCategory(FoodCategory category);

    List<Food> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);

    List<Food> findByStockQuantityGreaterThan(int q);
}
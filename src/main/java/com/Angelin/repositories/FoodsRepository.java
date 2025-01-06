package com.Angelin.repositories;

import com.Angelin.models.Foods;
import com.Angelin.models.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodsRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);

    Page<Order> findByUserId(Long userId, Pageable pageable);

    List<Foods> getAllFoods();

    Foods findFoodsById(Long id);

    Foods createFoods(Foods foods);

}

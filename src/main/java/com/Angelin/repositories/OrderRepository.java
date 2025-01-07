package com.Angelin.repositories;

import com.Angelin.models.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Interface for managing orders in the repository.
 */
public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByUserId(Long userId);
    Page<Order> findByUserId (Long userId, Pageable pageable);

}

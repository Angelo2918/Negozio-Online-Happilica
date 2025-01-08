package com.Angelin.repositories;

import com.Angelin.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface extending JpaRepository for managing Review entities in the database.
 * Provides basic CRUD operations for Review entities.
 */
public interface ReviewRepository extends JpaRepository<Review, Long> {
}

package com.Angelin.repositories;

import com.Angelin.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Represents a repository interface for User entities.
 * Contains methods to retrieve user information based on various criteria such as username, activity status, registration date, name, and sorting.
 */
public interface UserJpaRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    List<User> findByActive(boolean active);

    List<User> findAllByOrderByUsernameAsc();

    List<User> findByActiveOrderByUsernameDesc(boolean active);

}


package com.Angelin.repositories;

import com.Angelin.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


/**
 * An interface representing a repository for User entities. Extends JpaRepository for CRUD operations.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

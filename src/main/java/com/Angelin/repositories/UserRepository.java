package com.Angelin.repositories;

import com.Angelin.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * UserRepository interface extends CrudRepository to provide basic CRUD operations for User entities.
 * This interface does not introduce any additional methods but inherits methods for saving, deleting, and finding users by ID.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}

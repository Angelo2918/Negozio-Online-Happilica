package com.Angelin.repositories;

import com.Angelin.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Represents a repository for managing Address entities in the database.
 * This interface extends JpaRepository for basic CRUD operations.
 */
public interface AddressRepository extends JpaRepository<Address, Long> {

}

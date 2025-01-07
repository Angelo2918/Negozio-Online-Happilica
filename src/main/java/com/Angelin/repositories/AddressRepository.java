package com.Angelin.repositories;

import com.Angelin.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This interface represents a repository for managing Address entities.
 * Extended from JpaRepository to provide basic CRUD operations for Address entities.
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
}
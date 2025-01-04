package services;


import models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * This interface represents a service for managing address entities.
 * It extends JpaRepository for basic CRUD operations.
 */

public interface AddressService extends JpaRepository<Address, Long> {
    public Address addAddress(Address add);

    public Address updateAddress(Address add);

    public Address removeAddress(Integer id);

    public Address viewAddress(Integer addressId);

    public List<Address> viewAllAddress();
}

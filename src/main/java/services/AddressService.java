package services;

import models.Address;

import java.util.List;

/**
 * Interface representing a service for managing address entities.
 * Provides functionality to add, update, remove, and view individual addresses,
 * as well as retrieve a list of all addresses.
 */

public interface AddressService {
    public Address addAddress(Address add);

    public Address updateAddress(Address add);

    public Address removeAddress(Integer id);

    public Address viewAddress(Integer addressId);

    public List<Address> viewAllAddress();
}

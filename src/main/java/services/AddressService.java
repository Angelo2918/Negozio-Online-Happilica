package services;

import models.Address;

import java.util.List;

/**
 * AddressService interface represents a service for managing Address entities.
 * It provides methods to add, update, remove, view single address by ID, and view all addresses.
 */
public interface AddressService {
    public Address addAddress(Address add);

    public Address updateAddress(Address add);

    public Address removeAddress(Integer id);

    public Address viewAddress(Integer addressId);

    public List<Address> viewAllAddress();
}

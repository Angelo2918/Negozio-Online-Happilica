package services;

import models.Address;

import java.util.List;

public interface AddressService {
    public Address addAddress(Address add);
    public Address updateAddress(Address add);
    public Address removeAddress(Integer id);
    public Address viewAddress(Integer addressId);
    public List<Address> viewAllAddress();
}

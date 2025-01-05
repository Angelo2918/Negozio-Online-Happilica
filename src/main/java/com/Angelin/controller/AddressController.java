package com.Angelin.controller;

import com.Angelin.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Angelin.services.AddressService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(name = "/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/")
    public ResponseEntity<Address> saveAddressHandler(@Valid @RequestBody Address add) {
        Address savedAddress = addressService.addAddress(add);
        return new ResponseEntity<Address>(savedAddress, HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Address> updateAddressHandler(@Valid @RequestBody Address add) {
        Address updatedAddress = addressService.updateAddress(add);
        return new ResponseEntity<Address>(updatedAddress, HttpStatus.OK);
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<Address> deleteAddressHandler(@PathVariable("id") Integer addressId) {
        Address deletedAddress = addressService.removeAddress(addressId);
        return new ResponseEntity<Address>(deletedAddress, HttpStatus.OK);
    }

    @GetMapping("/get_address/{id}")
    public ResponseEntity<Address> getAddressHandler(@PathVariable("id") Integer addressId) {
        Address address = addressService.viewAddress(addressId);
        return new ResponseEntity<Address>(address, HttpStatus.OK);
    }

    @GetMapping("/get_all")
    public List<Address> getAllAddressHandler() {
        return addressService.viewAllAddress();
    }
}

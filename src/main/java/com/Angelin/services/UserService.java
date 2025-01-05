package com.Angelin.services;


import com.Angelin.models.User;


import java.util.List;
import java.util.Optional;


public interface UserService {
    Iterable<User> saveAll(List<User> users);

    Iterable<User> findAllUsers();

    void deleteUser(Long id);

    Optional<User> findUserByUsername(String username);

    User addUser(User user);

}
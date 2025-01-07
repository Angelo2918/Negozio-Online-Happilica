package com.Angelin.services;

import com.Angelin.DataTransferObject.CreateUserDto;
import com.Angelin.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Interface that defines methods for interacting with user data.
 */
@Service
public interface UserService {
        Iterable<User> saveAll(List<User> users);

        Iterable<User> findAllUsers();

        void deleteUser(Long id);

        Optional<User> findUserByUsername(String username);

        User addUser(User user);

        User createUserFromDto(CreateUserDto userDto);
}
package com.Angelin.services.impl;

import com.Angelin.DataTransferObject.CreateUserDto;
import com.Angelin.models.User;
import com.Angelin.repositories.UserJpaRepository;
import com.Angelin.repositories.UserRepository;
import com.Angelin.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of the UserService interface that provides methods to interact with user data.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserJpaRepository jpaRepository;
    @Autowired
    private ObjectMapper mapper;
    @Autowired
    private UserRepository repository;


    public Iterable<User> saveAll(List<User> users) {
        return jpaRepository.saveAll(users);
    }

    public Iterable<User> findAllUsers() {
        return jpaRepository.findAll();
    }

    public void deleteUser(Long id) {
        jpaRepository.deleteById(id);
    }

    public Optional<User> findUserByUsername(String username) {
        return jpaRepository.findByUsername(username);
    }

    public User addUser(User user) {
        return jpaRepository.save(user);
    }

    public User createUserFromDto(CreateUserDto userDto) {
        User user = mapper.convertValue(userDto, User.class);

        User savedUser = jpaRepository.save(user);
        return savedUser;
    }

}
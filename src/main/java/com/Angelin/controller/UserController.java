package com.Angelin.controller;

import com.Angelin.DataTransferObject.CreateUserDto;
import com.Angelin.models.User;
import com.Angelin.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * RestController handling user-related API endpoints.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;

    public UserController(UserService userService) {

        this.service = userService;
    }

    @PostMapping("/all")
    public ResponseEntity<Iterable<User>> createUsers(@RequestBody List<User> users) {
        Iterable<User> createdUsers = service.saveAll(users);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUsers);
    }

    @GetMapping
    public ResponseEntity<Iterable<User>> getAllUsers() {
        Iterable<User> users = service.findAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> findByUsername(@PathVariable String username) {
        Optional<User> user = service.findUserByUsername(username);

        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User savedUser = service.addUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping(value = "/create-from-dto", consumes = "application/json")
    public ResponseEntity<Map<String, String>> createUserFromDto(@RequestBody Map<String, String> user) {
        CreateUserDto newUser = new CreateUserDto();
        newUser.setName(user.get("name"));
        newUser.setEmail(user.get("email"));
        newUser.setUsername(user.get("username"));
        newUser.setActive(user.get("active").equals("true"));
        service.createUserFromDto(newUser);
        /*      User user = new User();
        try {
            user = service.createUserFromDto(userDto);
        } catch (UserServiceException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getErrorCode());

    "name": "Jon Travis",
    "email": "travisjon@gmail.com",
    "username": "jontri",
    "active": "true"
        }*/
        return ResponseEntity.ok(user);
    }

}
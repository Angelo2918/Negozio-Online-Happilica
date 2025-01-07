package com.Angelin.repositories;

import com.Angelin.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);

    List<User> findByActive(boolean active);

    List<User> findAllByOrderByUsernameAsc();

    List<User> findByActiveOrderByUsernameDesc(boolean active);

    List<User> findByRegistrationDateBetween(LocalDate start, LocalDate end);

    List<User> findByNameIgnoreCase(String name);

}


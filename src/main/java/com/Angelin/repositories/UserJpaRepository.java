package com.Angelin.repositories;


import com.Angelin.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User,Long> {
}
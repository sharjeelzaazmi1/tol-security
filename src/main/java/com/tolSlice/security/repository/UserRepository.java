package com.tolSlice.security.repository;

import java.util.Optional;

import com.tolSlice.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}

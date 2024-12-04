package com.example.freshvibes.repository;

import com.example.freshvibes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByEmail(String email);

    User findByAuthToken(String authToken);
}

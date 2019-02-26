package com.example.filemodel.repositories;

import com.example.filemodel.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

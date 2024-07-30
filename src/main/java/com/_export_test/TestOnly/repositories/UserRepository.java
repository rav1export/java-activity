package com._export_test.TestOnly.repositories;

import com._export_test.TestOnly.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom queries here if needed
}
package com.mobile.mobile.repository;

import com.mobile.mobile.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

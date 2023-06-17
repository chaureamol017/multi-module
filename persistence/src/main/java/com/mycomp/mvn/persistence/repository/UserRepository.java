package com.mycomp.mvn.persistence.repository;

import com.mycomp.mvn.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}

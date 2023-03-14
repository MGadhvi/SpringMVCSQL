package com.sparta.mg.springmvcsql.repositories;

import com.sparta.mg.springmvcsql.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
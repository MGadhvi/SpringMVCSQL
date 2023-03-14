package com.sparta.mg.springmvcsql.repositories;

import com.sparta.mg.springmvcsql.entities.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<CustomersEntity, String> {

}

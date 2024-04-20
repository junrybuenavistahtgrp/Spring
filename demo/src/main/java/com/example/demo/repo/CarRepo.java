package com.example.demo.repo;

import com.example.demo.entity.CarEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CarRepo extends JpaRepository<CarEntity, Long> {

}
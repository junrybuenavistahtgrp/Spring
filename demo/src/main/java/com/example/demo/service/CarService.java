package com.example.demo.service;

import com.example.demo.entity.CarEntity;
import java.util.List;
import java.util.Optional;

public interface CarService {
	List<CarEntity> findAllCar();
	Optional<CarEntity> findById(Long id);
	CarEntity saveCar(CarEntity carEntity);
	CarEntity updateCar(CarEntity carEntity);
	void deleteCar(Long id);
}
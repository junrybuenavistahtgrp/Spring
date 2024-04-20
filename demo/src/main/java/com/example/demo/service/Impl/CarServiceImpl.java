package com.example.demo.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CarEntity;
import com.example.demo.repo.CarRepo;
import com.example.demo.service.CarService;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepo carRepository;

    public CarServiceImpl(CarRepo carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<CarEntity> findAllCar() {
        return carRepository.findAll();
    }

    @Override
    public Optional<CarEntity> findById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public CarEntity saveCar(CarEntity carEntity) {
        return carRepository.save(carEntity);
    }

    @Override
    public CarEntity updateCar(CarEntity carEntity) {
        return carRepository.save(carEntity);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    } 

}

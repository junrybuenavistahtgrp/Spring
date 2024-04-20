package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.CarEntity;
import com.example.demo.repo.CarRepo;
import com.example.demo.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	private final CarRepo carRepository;

	public CarController(CarRepo carRepository) {
	        this.carRepository = carRepository;
	    }

	@GetMapping
    public List<CarEntity> findAllCar() {
		
		System.out.println();
        return carRepository.findAll();
    }
	
	 @GetMapping("/{id}")
	    public Optional<CarEntity> findById(@PathVariable("id") Long id) {
	        return carRepository.findById(id);
	    }
	  @PostMapping
	    public CarEntity saveCar(@RequestBody CarEntity carEntity) {
	        return carRepository.save(carEntity);
	    }
	  @PutMapping
	    public CarEntity updateCar(@RequestBody CarEntity carEntity) {
	        return carRepository.save(carEntity);
	    }
	  @DeleteMapping("/{id}")
	    public void deleteCar(@PathVariable("id") Long id) {
		  carRepository.deleteById(id);
	  }	 

}

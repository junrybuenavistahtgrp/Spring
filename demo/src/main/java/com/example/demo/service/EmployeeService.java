package com.example.demo.service;

import com.example.demo.entity.EmployeeEntity;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
	List<EmployeeEntity> findAllEmployee();
	Optional<EmployeeEntity> findById(Long id);
	EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
	void deleteEmployee(Long id);
}

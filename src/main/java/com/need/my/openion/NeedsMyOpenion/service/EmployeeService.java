package com.need.my.openion.NeedsMyOpenion.service;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.need.my.openion.NeedsMyOpenion.model.Employee;
import com.need.my.openion.NeedsMyOpenion.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private static final Logger LOGGER=LogManager.getLogger(EmployeeService.class);

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Cacheable("#employees")
  public Employee	addEmployee(Employee employee)
  {
	  LOGGER.info(" adding to db .....");
	return employeeRepository.save(employee); 
  }
	public Employee getEmployeeByID(String empId) {
		LOGGER.info("fetching from db...");
		Optional<Employee> employee =employeeRepository.findById(empId);
		if(employee.isPresent())
			return employee.get();
		else
		return new Employee();
		
	}
	
}

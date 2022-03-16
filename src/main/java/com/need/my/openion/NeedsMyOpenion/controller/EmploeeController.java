package com.need.my.openion.NeedsMyOpenion.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.need.my.openion.NeedsMyOpenion.model.Employee;
import com.need.my.openion.NeedsMyOpenion.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmploeeController {
	private static final Logger LOGGER=LogManager.getLogger(EmploeeController.class);

	@Autowired
	private EmployeeRepository employeeRepository;
	
	Employee employee2;
	
	@PostMapping("/saveemployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		LOGGER.info(" calling to controller add method.....");
		
		Employee employee2=employeeRepository.save(employee);
		System.out.println(employee2);
		return new ResponseEntity<>(employee2,HttpStatus.CREATED);
		
	}
	@GetMapping("/getemployee/{empId}")
	
	public ResponseEntity<?> getEmployeeByID(@PathVariable("empId") String empId) {
		 
		
		Optional<Employee> employee2=employeeRepository.findById(empId);
		
		return new ResponseEntity<>(employee2,HttpStatus.OK);
		
	}
	
	@PutMapping("/updateemployee/{empId}")
	public ResponseEntity<Employee> updateEmployeeByID(@PathVariable(value = "empId") String empId,@RequestBody Employee employee) {
		
		
		if(employeeRepository.existsById(empId))
			 employee2 =employeeRepository.save(employee);
		
		return new ResponseEntity<>(employee2,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteemployee/{empId}")
	public ResponseEntity<Employee> deleteEmployeeByID(@PathVariable(value = "empId") String empId) {
		
		Employee employee2=employeeRepository.getById(empId);
		employeeRepository.delete(employee2);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}
	
}

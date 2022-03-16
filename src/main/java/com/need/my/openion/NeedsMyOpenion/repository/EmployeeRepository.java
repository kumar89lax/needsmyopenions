package com.need.my.openion.NeedsMyOpenion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.need.my.openion.NeedsMyOpenion.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}

package com.hometest.crudservice.repository;

import com.hometest.crudservice.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
}

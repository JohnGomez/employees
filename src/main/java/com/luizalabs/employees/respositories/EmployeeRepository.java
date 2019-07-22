package com.luizalabs.employees.respositories;

import com.luizalabs.employees.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

package com.luizalabs.employees.services;

import com.luizalabs.employees.entities.Employee;
import com.luizalabs.employees.respositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee create (Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteById (Integer id) {
        employeeRepository.deleteById(id);
    }

}

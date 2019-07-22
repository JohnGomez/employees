package com.luizalabs.employees.services;

import com.luizalabs.employees.entities.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService service;

    @Test
    public void create() {
        Employee employee = new Employee();
        employee.setName("John Gomes da Silva");
        employee.setEmail("silva.johngomes@gmail.com");
        employee.setDepartment("Desenvolvimento");

        service.create(employee);
    }
}
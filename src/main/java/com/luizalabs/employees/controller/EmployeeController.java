package com.luizalabs.employees.controller;


import com.luizalabs.employees.entities.Employee;
import com.luizalabs.employees.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public ResponseEntity<List<Employee>> list () {
       return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity create (@RequestBody Employee employee) {
        service.create(employee);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete (@PathVariable Integer id) {
        try {
            service.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);

        } catch (EmptyResultDataAccessException e){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

}

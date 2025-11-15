package com.mybatis.spring_mybatis.controller;

import com.mybatis.spring_mybatis.dto.EmployeeDto;
import com.mybatis.spring_mybatis.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public String getEmployeeList(){
        return "list-employee";
    }

    @PostMapping
    public ResponseEntity<EmployeeDto>createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto newEmployee = employeeService.createEmployee(employeeDto);
        return ResponseEntity.ok(newEmployee);
    }

}

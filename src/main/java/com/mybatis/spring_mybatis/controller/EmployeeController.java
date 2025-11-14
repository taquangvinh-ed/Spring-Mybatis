package com.mybatis.spring_mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping
    public String getEmployeeList(){
        return "list-employee";
    }

}

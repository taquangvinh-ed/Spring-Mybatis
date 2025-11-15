package com.mybatis.spring_mybatis.service;

import com.mybatis.spring_mybatis.dto.EmployeeDto;

import java.awt.print.Pageable;
import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto updateEmployee(Integer employeeId, EmployeeDto employeeDto);

    void deleteEmployee(Integer employeeId);


    EmployeeDto getEmployeeById(Integer employeeId);

}

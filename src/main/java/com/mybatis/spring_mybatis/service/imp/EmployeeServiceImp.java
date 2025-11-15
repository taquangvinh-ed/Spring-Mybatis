package com.mybatis.spring_mybatis.service.imp;

import com.mybatis.spring_mybatis.dto.EmployeeDto;
import com.mybatis.spring_mybatis.mapper.EmployeeMapper;
import com.mybatis.spring_mybatis.mapstruct.EmployeeMapstruct;
import com.mybatis.spring_mybatis.model.Employee;
import com.mybatis.spring_mybatis.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {


    private final EmployeeMapper employeeMapper;
    private final EmployeeMapstruct employeeMapstruct;


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = employeeMapstruct.toEntity(employeeDto);
        employeeMapper.insertEmployee(employee);
        employeeDto.setEmployeeId(employee.getEmployeeId());

        return employeeDto;
    }

    @Override
    public EmployeeDto updateEmployee(Integer employeeId, EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public void deleteEmployee(Integer employeeId) {

    }


    @Override
    public EmployeeDto getEmployeeById(Integer employeeId) {
        return null;
    }
}

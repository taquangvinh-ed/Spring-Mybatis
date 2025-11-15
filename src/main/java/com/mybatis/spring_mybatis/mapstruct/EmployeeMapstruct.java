package com.mybatis.spring_mybatis.mapstruct;

import com.mybatis.spring_mybatis.dto.EmployeeDto;
import com.mybatis.spring_mybatis.model.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapstruct {

    Employee toEntity(EmployeeDto employeeDto);

    EmployeeDto toDto(Employee employee);

    List<EmployeeDto> toDtos(List<Employee> employees);

}

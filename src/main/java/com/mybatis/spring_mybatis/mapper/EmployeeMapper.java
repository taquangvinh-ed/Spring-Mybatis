package com.mybatis.spring_mybatis.mapper;

import com.mybatis.spring_mybatis.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface  EmployeeMapper {

    List<Employee> findAllEmployeesPaginated(@Param("limit") int limit, @Param("offset") long offset);

    Employee findEmployeeById(Integer employeeId);

    int insertEmployee(Employee employee);
}

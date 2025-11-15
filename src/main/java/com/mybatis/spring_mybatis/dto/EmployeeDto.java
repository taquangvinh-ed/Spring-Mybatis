package com.mybatis.spring_mybatis.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto {
    private Integer employeeId;
    private String fullName;
    private String email;
}

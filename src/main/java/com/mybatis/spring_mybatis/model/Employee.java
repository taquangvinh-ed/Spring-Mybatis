package com.mybatis.spring_mybatis.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Employee {

    private Integer employeeId;

    private String fullName;

    private String email;

    private String gender;

    private String hobbies;

    private String country;

    private String address;


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

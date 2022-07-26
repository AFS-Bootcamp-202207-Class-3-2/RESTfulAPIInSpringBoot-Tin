package com.rest.springbootemployee.pojo;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private Integer id;

    private String companyName;

    private List<Employee> employeeList;

}

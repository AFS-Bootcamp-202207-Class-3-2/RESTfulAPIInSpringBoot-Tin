package com.rest.springbootemployee.pojo;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private Integer id;

    private List<Employee> employeeList;

}

package com.rest.springbootemployee.Repository;

import com.rest.springbootemployee.execption.CompanyNotFoundException;
import com.rest.springbootemployee.pojo.Company;
import com.rest.springbootemployee.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CompanyRepository {

    private List<Company> companies;

    public CompanyRepository() {
        companies = new ArrayList<>();
        companies.add(new Company(1, new ArrayList<Employee>(){{
            add(new Employee(1,"AAA", 23, "male", 8000));
            add(new Employee(2,"BBB", 24, "female", 6000));
        }}));
        companies.add(new Company(2, new ArrayList<Employee>(){{
            add(new Employee(1,"CCC", 25, "male", 8000));
            add(new Employee(2,"DDD", 26, "female", 5000));
        }}));
    }

    public List<Company> findAll() {
        return this.companies;
    }


    public Company findById(Integer id) {
        return this.companies.stream()
                .filter(company -> company.getId().equals(id))
                .findFirst()
                .orElseThrow(CompanyNotFoundException::new);
    }
}

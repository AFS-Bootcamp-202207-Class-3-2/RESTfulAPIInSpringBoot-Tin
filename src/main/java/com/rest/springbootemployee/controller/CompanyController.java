package com.rest.springbootemployee.controller;

import com.rest.springbootemployee.Repository.CompanyRepository;
import com.rest.springbootemployee.pojo.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping
    public List<Company> getCompanies(){
        return companyRepository.findAll();
    }
}
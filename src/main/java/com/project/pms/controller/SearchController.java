package com.project.pms.controller;

import com.project.pms.entity.Employee;
import com.project.pms.entity.ProjectApplication;
import com.project.pms.service.EmployeeSearchService;
import com.project.pms.service.ProjectApplicationSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {
    @Autowired
    private EmployeeSearchService employeeSearchService;

    @Autowired
    private ProjectApplicationSearchService projectApplicationSearchService;

    @GetMapping("/employees")
    public @ResponseBody List<Employee> getAllEmployees(){
        System.out.println("All employees" + employeeSearchService.getAll());
        return employeeSearchService.getAll();
    }

    @GetMapping("/projectapplications")
    public @ResponseBody List<ProjectApplication> getAllProjectApplications(){
        System.out.println("All project applications" + projectApplicationSearchService.getAll());
        return projectApplicationSearchService.getAll();
    }
}

package com.project.pms.controller;

import com.project.pms.entity.Employee;
import com.project.pms.entity.ProjectApplication;
import com.project.pms.service.EmployeeSearchService;
import com.project.pms.service.ProjectApplicationSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SearchController {
    @Autowired
    private EmployeeSearchService employeeSearchService;

    @Autowired
    private ProjectApplicationSearchService projectApplicationSearchService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employees")
    public @ResponseBody List<Employee> getAllEmployees(){
        //System.out.println("All employees" + employeeSearchService.getAll());
        return employeeSearchService.getAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/projectapplications")
    public @ResponseBody List<ProjectApplication> getAllProjectApplications(){
        //System.out.println("All project applications" + projectApplicationSearchService.getAll());
        return projectApplicationSearchService.getAll();
    }
}

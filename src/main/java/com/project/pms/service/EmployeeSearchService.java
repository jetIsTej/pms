package com.project.pms.service;

import com.project.pms.entity.Employee;

import java.util.List;

public interface EmployeeSearchService extends SearchService{
    List<Employee> searchByEmployeeFirstName(String partialEmployeeFirstName);
    List<Employee> searchByEmployeeLastName(String partialEmployeeLastName);
    List<Employee> searchByEmployeeDesignation(String partialEmployeeDesignation);
    List<Employee> searchByCurrentProjectApplicationId(Integer currentProjectApplicationId);
}

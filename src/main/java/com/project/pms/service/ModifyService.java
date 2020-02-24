package com.project.pms.service;

import com.project.pms.entity.Employee;
import com.project.pms.entity.ProjectApplication;

import java.util.UUID;

public interface ModifyService {
    void addProjectApplicaitonDetails(ProjectApplication projectApplication);
    void addEmployeeDetails(Employee employee);
    void updateProjectApplicationDetails(ProjectApplication projectApplication);
    void updateEmployeeDetails(Employee employee);
    boolean deleteProjectApplicationDetailsByUUID(UUID projectApplicationUUID);
    boolean deleteEmployeeDetailsByUUID(UUID employeeUUID);
}

package com.project.pms.service;

import com.project.pms.entity.Employee;
import com.project.pms.entity.ProjectApplication;

import java.util.UUID;

public interface UpdateService {
    void updateProjectApplicationDetails(ProjectApplication projectApplication);
    void updateEmployeeDetails(Employee employee);
}

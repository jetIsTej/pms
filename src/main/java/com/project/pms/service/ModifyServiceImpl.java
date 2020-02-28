package com.project.pms.service;

import com.project.pms.entity.Employee;
import com.project.pms.entity.ProjectApplication;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ModifyServiceImpl implements ModifyService {
    @Override
    public void addProjectApplicaitonDetails(ProjectApplication projectApplication) {

    }

    @Override
    public void addEmployeeDetails(Employee employee) {

    }

    @Override
    public void updateProjectApplicationDetails(ProjectApplication projectApplication) {

    }

    @Override
    public void updateEmployeeDetails(Employee employee) {

    }

    @Override
    public boolean deleteProjectApplicationDetailsByUUID(UUID projectApplicationUUID) {
        return false;
    }

    @Override
    public boolean deleteEmployeeDetailsByUUID(UUID employeeUUID) {
        return false;
    }
}

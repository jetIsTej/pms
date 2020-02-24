package com.project.pms.service;

import com.project.pms.dao.EmployeeDAO;
import com.project.pms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeSearchServiceImpl implements EmployeeSearchService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<Employee> searchByEmployeeFirstName(String partialEmployeeFirstName) {
        return null;
    }

    @Override
    public List<Employee> searchByEmployeeLastName(String partialEmployeeLastName) {
        return null;
    }

    @Override
    public List<Employee> searchByEmployeeDesignation(String partialEmployeeDesignation) {
        return null;
    }

    @Override
    public List<Employee> searchByCurrentProjectApplicationId(Integer currentProjectApplicationId) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Object searchByUUID(UUID uuid) {
        return null;
    }

    @Override
    public Object searchById(Integer id) {
        return null;
    }
}

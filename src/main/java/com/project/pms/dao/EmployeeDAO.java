package com.project.pms.dao;

import com.project.pms.dao.repositories.EmployeeRepository;
import com.project.pms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class EmployeeDAO {

    @Autowired
    private CassandraOperations cassandraTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    //List results
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeesByFirstName(String employeeFirstName){
        return employeeRepository.findByEmpFirstName(employeeFirstName);
    }

    //Single results
    public Employee getEmployeeByUUID(UUID employeeUUID){
        Optional<Employee> value = employeeRepository.findByEmployeeUUID(employeeUUID);
        return value.orElse(null);
    }

    public Employee getEmployeeByCompanyEmployeeId(Integer companyEmployeeId){
        Optional<Employee> value = employeeRepository.findByCompanyEmployeeId(companyEmployeeId);
        return value.orElse(null);
    }
}

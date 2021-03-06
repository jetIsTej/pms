package com.project.pms.dao.repositories;

import com.project.pms.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository extends CrudRepository<Employee, UUID> {
    Optional<Employee> findByEmployeeUUID(UUID employeeUUID);
    Optional<Employee> findByCompanyEmployeeId(Integer companyEmployeeId);
    List<Employee> findByEmpFirstNameLike(String firstNameExpression);
    Slice<Employee> findByEmpFirstNameLike(String firstName, Pageable pageRequest);
    List<Employee> findByEmpLastNameLike(String lastNameExpression);
    List<Employee> findByEmployeeDesignationLike(String employeeDesignationExpression);
    List<Employee> findByCurrentProjectApplicationId(Integer currentProjectApplicationId);
    List<Employee> findAll();

    @Override
    long count();
}

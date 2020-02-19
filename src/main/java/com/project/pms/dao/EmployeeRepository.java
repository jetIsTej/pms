package com.project.pms.dao;

import com.project.pms.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
    List<Employee> findByApplicationEmployeeId(Integer applicationEmployeeId);
    List<Employee> findByCompanyEmployeeId(Integer companyEmployeeId);
    List<Employee> findByFirstName(String firstName);
    Slice<Employee> findByFirstName(String firstName, Pageable pageRequest);
    List<Employee> findByFirstNameLike(String nameExpression);
    Stream<Employee> findAllBy();
}

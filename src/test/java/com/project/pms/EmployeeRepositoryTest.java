package com.project.pms;

import com.project.pms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration
public class EmployeeRepositoryTest {
    /*@Autowired
    EmployeeRepository employeeRepository;

    public void readPersonTableCorrectlyTest(){
        List<Employee> employees = employeeRepository.findAll();
        assertThat(employees.isEmpty()).isFalse();
    }*/

    /*@Test
    public void readsPagesCorrectly() {

      Slice<Person> firstBatch = repository.findAll(CassandraPageRequest.first(10));

      assertThat(firstBatch).hasSize(10);

      Page<Person> nextBatch = repository.findAll(firstBatch.nextPageable());

      // …
    }*/


}

package com.poc.micronaut.empmgmt.repository;

import com.poc.micronaut.empmgmt.entity.Employee;
import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {
    @Executable
    Employee findByEmployeeNumber(Long employeeNumber);
}

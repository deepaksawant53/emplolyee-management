package com.poc.micronaut.empmgmt.service;

import com.poc.micronaut.empmgmt.entity.Employee;
import com.poc.micronaut.empmgmt.filter.EmployeeFilter;
import com.poc.micronaut.empmgmt.repository.EmployeeRepository;
import com.poc.micronaut.empmgmt.specification.EmployeeSpecification;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.List;

@Singleton
public class EmployeeService {
    @Inject
    EmployeeRepository employeeRepository;

    @Transactional
    public Employee getEmployee(Long employeeNumber) {
        return employeeRepository.findByEmployeeNumber(employeeNumber);
    }

    @Transactional
    public List<Employee> getEmployees(EmployeeFilter employeeFilter) {
        EmployeeSpecification employeeSpecification = new EmployeeSpecification(employeeFilter);
        return employeeRepository.findAll(employeeSpecification);
    }
}

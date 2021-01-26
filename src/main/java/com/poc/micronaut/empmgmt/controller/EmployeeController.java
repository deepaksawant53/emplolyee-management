package com.poc.micronaut.empmgmt.controller;

import com.poc.micronaut.empmgmt.entity.Employee;
import com.poc.micronaut.empmgmt.filter.EmployeeFilter;
import com.poc.micronaut.empmgmt.service.EmployeeService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

@Controller("/employee")
public class EmployeeController {
    @Inject
    EmployeeService employeeService;

    @Get("/find/{empId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(String empId) {
        return employeeService.getEmployee(Long.parseLong(empId));
    }

    @Get("/welcome/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public String greet(String name) {
        return "Hello " + name + "!!!!";
    }

    @Get("/filter{?filter*}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployees(@Valid EmployeeFilter filter) {
        return employeeService.getEmployees(filter);
    }
}

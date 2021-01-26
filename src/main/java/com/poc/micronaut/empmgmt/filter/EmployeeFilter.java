package com.poc.micronaut.empmgmt.filter;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

import java.util.Optional;

@Introspected
public class EmployeeFilter {
    @JsonProperty("employeeNumber")
    private Optional<Long> employeeNumber;
    @JsonProperty("lastName")
    private Optional<String> lastName;
    @JsonProperty("firstName")
    private Optional<String> firstName;
    @JsonProperty("extension")
    private Optional<String> extension;
    @JsonProperty("email")
    private Optional<String> email;
    @JsonProperty("officeCode")
    private Optional<Integer> officeCode;
    @JsonProperty("reportsTo")
    private Optional<Long> reportsTo;
    @JsonProperty("jobTitle")
    private Optional<String> jobTitle;

    public Optional<Long> getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Optional<Long> employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Optional<String> getLastName() {
        return lastName;
    }

    public void setLastName(Optional<String> lastName) {
        this.lastName = lastName;
    }

    public Optional<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(Optional<String> firstName) {
        this.firstName = firstName;
    }

    public Optional<String> getExtension() {
        return extension;
    }

    public void setExtension(Optional<String> extension) {
        this.extension = extension;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public Optional<Integer> getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(Optional<Integer> officeCode) {
        this.officeCode = officeCode;
    }

    public Optional<Long> getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Optional<Long> reportsTo) {
        this.reportsTo = reportsTo;
    }

    public Optional<String> getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(Optional<String> jobTitle) {
        this.jobTitle = jobTitle;
    }
}

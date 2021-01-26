package com.poc.micronaut.empmgmt.specification;

import com.poc.micronaut.empmgmt.entity.Employee;
import com.poc.micronaut.empmgmt.filter.EmployeeFilter;
import io.micronaut.core.util.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeSpecification implements Specification<Employee> {
    private EmployeeFilter employeeFilter;

    public EmployeeSpecification(EmployeeFilter employeeFilter) {
        this.employeeFilter = employeeFilter;
    }

    @Override
    public Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();

        if (Objects.nonNull(employeeFilter.getEmail()))
            predicates.add(criteriaBuilder.equal(root.get("email"), employeeFilter.getEmail().get()));
        if (Objects.nonNull(employeeFilter.getOfficeCode()))
            predicates.add(root.get("officeCode").in(employeeFilter.getOfficeCode().get()));

        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
    }
}

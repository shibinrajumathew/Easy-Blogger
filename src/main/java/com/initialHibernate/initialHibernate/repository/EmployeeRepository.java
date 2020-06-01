package com.initialHibernate.initialHibernate.repository;

import com.initialHibernate.initialHibernate.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

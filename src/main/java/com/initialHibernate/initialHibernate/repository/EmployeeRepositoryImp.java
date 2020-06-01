package com.initialHibernate.initialHibernate.repository;

import com.initialHibernate.initialHibernate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Repository
public class EmployeeRepositoryImp {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllNames() {
        return employeeRepository.findAll();
    }
}

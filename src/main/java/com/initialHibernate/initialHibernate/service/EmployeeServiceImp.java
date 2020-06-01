package com.initialHibernate.initialHibernate.service;

import com.initialHibernate.initialHibernate.dto.EmployeeDTO;
import com.initialHibernate.initialHibernate.model.Employee;
import com.initialHibernate.initialHibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public ArrayList<EmployeeDTO> getAllNames() {
       List<Employee> result =  employeeRepository.findAll();
        return this.populateEmployee(result);
    }
    private ArrayList<EmployeeDTO> populateEmployee(List<Employee> result){
        ArrayList<EmployeeDTO> populatedResult = new ArrayList<>();
        for (Employee employee: result) {
            EmployeeDTO populatedDto = new EmployeeDTO();
            populatedDto.setName(employee.getName());
            populatedDto.setDateOfJoining(employee.getDateOfJoining());
            populatedDto.setSalary(employee.getSalary());
            populatedResult.add(populatedDto);
        };
        return populatedResult;
    }
}
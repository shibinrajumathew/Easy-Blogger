package com.initialHibernate.initialHibernate.facade;

import com.initialHibernate.initialHibernate.dto.EmployeeDTO;
import com.initialHibernate.initialHibernate.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeFacadeImp implements EmployeeFascade {
    @Autowired
    EmployeeServiceImp employeeServiceImp;

    @Override
    public ArrayList<EmployeeDTO> getAllNames() {
        return employeeServiceImp.getAllNames();
    }
}

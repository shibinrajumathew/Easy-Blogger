package com.initialHibernate.initialHibernate.controller;

import com.initialHibernate.initialHibernate.dto.EmployeeDTO;
import com.initialHibernate.initialHibernate.exception.model.EntityNotFoundException;
import com.initialHibernate.initialHibernate.facade.EmployeeFacadeImp;
import com.initialHibernate.initialHibernate.model.Employee;
import com.initialHibernate.initialHibernate.util.CustomResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Slf4j
@RestController
public class EmployeeController {
    @Autowired
    EmployeeFacadeImp employeeFacadeImp;
    @Autowired
    CustomResponse customResponse;

    @RequestMapping(name="list names", value = "/getAllNames", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity <?> getAllNames() {
        ArrayList<EmployeeDTO> resData = employeeFacadeImp.getAllNames();
        log.info("getAllNames() - response : "+resData);
        if(resData.isEmpty()) throw new EntityNotFoundException("No results found, result:"+resData);
        return  customResponse.setSuccessData(resData);
//        return new ResponseEntity<>(resData, HttpStatus.OK);
    }
}

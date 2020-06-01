package com.initialHibernate.initialHibernate.dto;

import lombok.Data;

import java.util.Date;
@Data
public class EmployeeDTO {
        private String name;
        private Date dateOfJoining;
        private Double salary;
}

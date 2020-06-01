package com.initialHibernate.initialHibernate.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Table(name="employee")
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @NotBlank
    @Column(name = "name")
    private String name;
    @Column(name = "date_of_joining")
    private Date dateOfJoining;
    @Column(name = "salary")
    private Double salary;

}

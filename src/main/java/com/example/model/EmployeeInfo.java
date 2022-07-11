package com.example.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "employee_info")
public class EmployeeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    public Long empId;
    @Column (name = "emp_name")
    public String empName;
    @Column (name = "emp_age")
    public String empAge;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "add_fk_primary")
//    Address address123;

    //one to many relation
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "add_emp_foreign",referencedColumnName = "emp_id")
    List<Address> address;
}

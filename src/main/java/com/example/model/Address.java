package com.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    public Long addId;
    @Column(name = "current_city")
    public String currentCity;
    @Column(name = "permanent_city")
    public String permanentCity;
//    @OneToOne(mappedBy = "address123")
//    EmployeeInfo employeeInfo;
}

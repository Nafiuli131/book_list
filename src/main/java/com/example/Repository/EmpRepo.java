package com.example.Repository;

import com.example.model.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<EmployeeInfo,Long> {

}

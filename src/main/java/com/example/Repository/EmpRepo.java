package com.example.Repository;

import com.example.model.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpRepo extends JpaRepository<EmployeeInfo,Long> {

    @Query(value = "select e from   EmployeeInfo e  where  e.empId=?1")
    public EmployeeInfo getEmpInfo(Long id);
}

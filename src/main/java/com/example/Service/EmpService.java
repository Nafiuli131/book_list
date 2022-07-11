package com.example.Service;

import com.example.Repository.EmpRepo;
import com.example.model.EmployeeInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    EmpRepo empRepo;

    public EmpService(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }
    public EmployeeInfo saveEmployee(EmployeeInfo employeeInfo){
        return empRepo.save(employeeInfo);
    }
}

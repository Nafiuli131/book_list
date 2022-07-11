package com.example.Service;

import com.example.Repository.EmpRepo;
import com.example.model.EmployeeInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public EmployeeInfo getInfo(long id){
        return empRepo.getEmpInfo(id);
    }
}

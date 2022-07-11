package com.example.Controller;

import com.example.Service.EmpService;
import com.example.model.EmployeeInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    EmpService empService;

    public EmployeeController(EmpService empService) {
        this.empService = empService;
    }

    @PostMapping("saveEmp")
    public EmployeeInfo saveEmployeeInfo(@RequestBody EmployeeInfo employeeInfo){
        return empService.saveEmployee(employeeInfo);
    }
}

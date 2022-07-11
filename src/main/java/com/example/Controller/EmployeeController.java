package com.example.Controller;

import com.example.Service.EmpService;
import com.example.model.EmployeeInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("getEmp/{id}")
    public ResponseEntity<EmployeeInfo> getInfo(@PathVariable("id") Long id){
        if(empService.getInfo(id)==null){
            return new ResponseEntity<EmployeeInfo>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<EmployeeInfo>(empService.getInfo(id),HttpStatus.OK);
        }
    }
}

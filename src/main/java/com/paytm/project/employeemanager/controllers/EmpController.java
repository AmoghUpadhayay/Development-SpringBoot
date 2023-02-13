package com.paytm.project.employeemanager.controllers;

import com.paytm.project.employeemanager.model.Emp;
import com.paytm.project.employeemanager.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/employees")
    public List<Emp> getEveryEmp()
    {
        return empService.getEveryEmp();
    }
    @GetMapping("/departments/{id}/employees")
    public List<Emp> getAllEmps(@PathVariable Long id){
        return empService.getAllEmps(id);
    }

    @GetMapping("/employees/{id}")
    public Emp getEmp(@PathVariable Long id) {
        return empService.getEmp(id);
    }

    @PostMapping("/employees")
    public void addEmp(@RequestBody Emp emp){
        empService.addEmp(emp);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmp(@PathVariable Long id) {
        empService.deleteEmp(id);
    }

    @PutMapping("/employees/{id}")
    public void updateEmp(@RequestBody Emp emp)
    {
        empService.updateEmp(emp);
    }
}

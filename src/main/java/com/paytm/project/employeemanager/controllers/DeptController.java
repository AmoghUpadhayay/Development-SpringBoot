package com.paytm.project.employeemanager.controllers;

import com.paytm.project.employeemanager.model.Dept;
import com.paytm.project.employeemanager.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/departments")
    public List<Dept> getAllDepts() {
        return deptService.getAllDepts();
    }
    @GetMapping("/departments/{name}")
    public Dept getDeptByName(@PathVariable String name) {
        return deptService.getDeptByName(name);
    }
    @PostMapping("/departments")
    public void addDept(@RequestBody Dept dept) {
        deptService.addDept(dept);
    }
    @DeleteMapping("/departments/{id}")
    public void deleteDept(@PathVariable Long id) {
        deptService.deleteDept(id);
    }
    @PutMapping("/departments/{id}")
    public void updateDept(@RequestBody Dept dept) {
        deptService.updateDept(dept);
    }
}

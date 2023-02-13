package com.paytm.project.employeemanager.services;

import com.paytm.project.employeemanager.model.Dept;
import com.paytm.project.employeemanager.repos.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    private DeptRepo deptRepo;

    public DeptService(DeptRepo deptRepo) {
        this.deptRepo = deptRepo;
    }

    public List<Dept> getAllDepts() {
        return deptRepo.findAll();
    }
    public void addDept(Dept dept) {
        deptRepo.save(dept);
    }
    public Dept getDeptByName(String name) {
        return deptRepo.findByName(name);
    }
    public void deleteDept(Long id) {
        deptRepo.deleteById(id);
    }
    public void updateDept(Dept dept) {
        deptRepo.save(dept);
    }
}

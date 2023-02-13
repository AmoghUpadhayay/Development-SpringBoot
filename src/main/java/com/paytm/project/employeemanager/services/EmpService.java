package com.paytm.project.employeemanager.services;

import com.paytm.project.employeemanager.model.Emp;
import com.paytm.project.employeemanager.repos.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    public List<Emp> getAllEmps(Long id) {
        return empRepo.findByDeptId(id);
    }

    public Emp getEmp(Long id) {
        return empRepo.findById(id).get();
    }

    public void addEmp(Emp emp) {
        empRepo.save(emp);
    }

    public void deleteEmp(Long id) {
        empRepo.deleteById(id);
    }

    public void updateEmp(Emp emp) {
        empRepo.save(emp);
    }

    public List<Emp> getEveryEmp() {
        return empRepo.findAll();
    }
}

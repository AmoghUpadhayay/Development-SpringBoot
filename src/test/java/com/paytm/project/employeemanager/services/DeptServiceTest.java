package com.paytm.project.employeemanager.services;

import com.paytm.project.employeemanager.model.Dept;
import com.paytm.project.employeemanager.repos.DeptRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DeptServiceTest {

    @Mock
    DeptRepo deptRepo;

    @InjectMocks
    DeptService deptService;

    @Test
    void getAllDepts() {
        deptService.getAllDepts();
        verify(deptRepo).findAll();
    }

    @Test
    void addDept() {
        Dept dept = new Dept(5L,"Logistics","Logistics Dept");
        deptService.addDept(dept);
        verify(deptRepo).save(dept);
    }

    @Test
    void getDeptByName() {
        Dept dept = new Dept(5L,"Logistics","Logistics Dept");
        deptService.addDept(dept);
        verify(deptRepo).save(dept);
    }

    @Test
    void deleteDept() {
        Dept dept = new Dept(5L,"Logistics","Logistics Dept");
        deptRepo.save(dept);
        deptService.deleteDept(5L);
        verify(deptRepo).deleteById(5L);
    }

    @Test
    void updateDept() {
        Dept dept = new Dept(5L,"Logistics","Logistics Dept");
        deptService.updateDept(dept);
        verify(deptRepo).save(dept);
    }
}
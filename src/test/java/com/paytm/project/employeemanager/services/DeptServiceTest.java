package com.paytm.project.employeemanager.services;

import com.paytm.project.employeemanager.model.Dept;
import com.paytm.project.employeemanager.repos.DeptRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;

class DeptServiceTest {

    @Mock
    private DeptRepo deptRepo;
    private DeptService deptService;

    @BeforeEach
    void setUp() {
        deptService = new DeptService(this.deptRepo);
    }
    @Test
    void getAllDepts() {
        deptService.getAllDepts();
        verify(deptRepo).findAll();
    }

    @Test
    void addDept() {
        Dept dept = new Dept(1L,"HR", "HR Dept");
        deptService.addDept(dept);
        verify(deptRepo).save(dept);
    }

    @Test
    void getDeptByName() {
        Dept dept = new Dept(1L,"HR", "HR Dept");
        deptService.getDeptByName("HR");
        verify(deptRepo).findByName("HR");
    }
    /*
    @Test
    void deleteDept() {
        deptService.delete
    }

    @Test
    void updateDept() {
    }*/
}
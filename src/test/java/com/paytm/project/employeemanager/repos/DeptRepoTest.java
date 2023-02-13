package com.paytm.project.employeemanager.repos;

import com.paytm.project.employeemanager.model.Dept;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DeptRepoTest {

    private DeptRepo deptRepo;

    @Test
    void findByName() {
        //expected
        Dept expectedResult = new Dept(4L,"Logistics","Logistics Dept");
        deptRepo.save(expectedResult);
        // actual
        Dept actualResult = deptRepo.findByName("Logistics");
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @AfterEach
    void tearDown()
    {
        deptRepo.deleteAll();
    }
}
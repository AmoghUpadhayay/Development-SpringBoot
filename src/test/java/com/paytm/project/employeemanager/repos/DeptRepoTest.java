package com.paytm.project.employeemanager.repos;

import com.paytm.project.employeemanager.model.Dept;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DeptRepoTest {

    @Autowired
    private DeptRepo deptRepo;

    @Test
    void findByName() {
        Dept expectedResult = new Dept(5L,"LG","Logistics Dept");
        deptRepo.save(expectedResult);

        Dept actualResult = deptRepo.findByName("LG");
        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expectedResult);
    }
}
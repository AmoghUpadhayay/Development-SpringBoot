package com.paytm.project.employeemanager.repos;

import com.paytm.project.employeemanager.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepo extends JpaRepository<Dept, Long> {

    Dept findByName(String name);
}

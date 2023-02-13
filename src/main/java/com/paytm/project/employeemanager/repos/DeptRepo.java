package com.paytm.project.employeemanager.repos;

import com.paytm.project.employeemanager.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends JpaRepository<Dept, Long> {

    Dept findByName(String name);
}

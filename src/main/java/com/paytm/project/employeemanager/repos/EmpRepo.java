package com.paytm.project.employeemanager.repos;

import com.paytm.project.employeemanager.model.Emp;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpRepo extends JpaRepository<Emp, Long> {
    @EntityGraph(attributePaths = {"dept"})
    List<Emp> findByDeptId(Long id);
}

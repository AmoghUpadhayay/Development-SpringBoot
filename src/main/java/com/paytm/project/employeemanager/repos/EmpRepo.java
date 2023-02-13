package com.paytm.project.employeemanager.repos;

import com.paytm.project.employeemanager.model.Emp;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Long> {
    @EntityGraph(attributePaths = {"dept"})
    List<Emp> findByDeptId(Long id);
}

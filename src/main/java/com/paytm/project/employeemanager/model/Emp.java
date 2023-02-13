package com.paytm.project.employeemanager.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Emp {
    @Id
    private Long id;
    private String name;
    private Long age;

    @ManyToOne(/*fetch = FetchType.LAZY*/cascade = CascadeType.REMOVE)
    private Dept dept;

    public Emp() {
    }

    public Emp(Long id, String name, Long age, Dept dept) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }
    public void setAge(Long age) {
        this.age = age;
    }
}

package com.paytm.project.employeemanager.model;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Dept {

    @Id
    //@Column(name = "deptId")
    private Long id;

    //@Column(name = "deptName")
    private String name;

    //@Column(name = "description")
    private String description;

    public Dept() {
    }

    public Dept(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

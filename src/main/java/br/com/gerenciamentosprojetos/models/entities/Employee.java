package br.com.gerenciamentosprojetos.models.entities;

import java.util.List;

import javax.persistence.*;

import org.springframework.lang.NonNull;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "office", nullable = false, length = 80)
    private String office;

    @ManyToMany(mappedBy = "employees")
    private List<Project> projects;

    public Employee(){}

    public Employee(String name, String office) {
        this.name = name;
        this.office = office;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
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

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return name + " - " + office;
    }

}
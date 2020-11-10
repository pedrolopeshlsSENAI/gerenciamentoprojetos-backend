package br.com.gerenciamentosprojetos.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 80)
    private String name;

    @Column(nullable = false, length = 200)
    private String description;

    @Column(nullable = false, length = 70)
    private String status;

    @Column(nullable = false, length = 45)
    private String risk;

    @Column(nullable = false)
    private double budget;

    @Column(name="initial_date", nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date initialDate;

    @Column(name="prevision_date", nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date previsionDate;

    @Column(name="final_date", nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date finalDate;

    @OneToOne
    @JoinColumn(name="employee_id", referencedColumnName = "id")
    private Employee manager;

    @ManyToMany
    @JoinTable(name="project_employee",
            joinColumns = @JoinColumn(name="project_id"),
            inverseJoinColumns = @JoinColumn(name="employee_id"))
    private List<Employee> employees;

    public Project(){}

    public Project(String name, String description, String status, String risco, double budget, Date initialDate, Date previsionDate, Date finalDate, Employee manager) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.risk = risco;
        this.budget = budget;
        this.initialDate = initialDate;
        this.previsionDate = previsionDate;
        this.finalDate = finalDate;
        this.manager = manager;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getPrevisionDate() {
        return previsionDate;
    }

    public void setPrevisionDate(Date previsionDate) {
        this.previsionDate = previsionDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


    @Override
    public String toString() {
        return "Projeto " + name + ", descricao: " + description + ", status: " + status + "\nrisco: "
                + risk + ", orcamento: " + budget + ", data início: " + initialDate + ", data previsão: " + previsionDate
                + ", data final=" + finalDate + ", gerente:" + manager + ", funcionários: " + employees;
    }
}
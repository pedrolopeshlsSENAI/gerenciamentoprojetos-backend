package br.com.gerenciamentosprojetos.models.entities;

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
    private Date initialDate;

    @Column(name="prevision_date", nullable = false)
    private Date previsionDate;

    @Column(name="final_date", nullable = false)
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

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
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

    public String getRisco() {
        return risk;
    }

    public void setRisco(String risco) {
        this.risk = risco;
    }

    public double getOrcamento() {
        return budget;
    }

    public void setOrcamento(double budget) {
        this.budget = budget;
    }

    public Date getDataInicio() {
        return initialDate;
    }

    public void setDataInicio(Date initialDate) {
        this.initialDate = initialDate;
    }

    public Date getDataPrevisao() {
        return previsionDate;
    }

    public void setDataPrevisao(Date previsionDate) {
        this.previsionDate = previsionDate;
    }

    public Date getDataFinal() {
        return finalDate;
    }

    public void setDataFinal(Date finalDate) {
        this.finalDate = finalDate;
    }

    public Employee getGerente() {
        return manager;
    }

    public void setGerente(Employee manager) {
        this.manager = manager;
    }

    public List<Employee> getFuncionarios() {
        return employees;
    }

    public void setFuncionarios(List<Employee> employees) {
        this.employees = employees;
    }


    @Override
    public String toString() {
        return "Projeto " + name + ", descricao: " + description + ", status: " + status + "\nrisco: "
                + risk + ", orcamento: " + budget + ", data início: " + initialDate + ", data previsão: " + previsionDate
                + ", data final=" + finalDate + ", gerente:" + manager + ", funcionários: " + employees;
    }
}
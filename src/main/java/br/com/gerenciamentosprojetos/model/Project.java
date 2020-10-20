package br.com.gerenciamentosprojetos.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity(name="projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Size(max=80)
    private String nome;

    @NonNull
    @Size(max=200)
    private String description;

    @NonNull
    @Size(max=70)
    private String status;

    @NonNull
    @Size(max=45)
    private String risk;

    @NonNull
    private double budget;

    @NonNull
    @Column(name="inicial_date")
    private Date inicialDate;

    @NonNull
    @Column(name="prevision_date")
    private Date previsionDate;

    @NonNull
    @Column(name="final_date")
    private Date finalDate;

    @OneToOne
    @JoinColumn(name="employee_id", referencedColumnName = "id")
    private Employee gerente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Date getInicialDate() {
        return inicialDate;
    }

    public void setInicialDate(Date inicialDate) {
        this.inicialDate = inicialDate;
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

    public Employee getGerente() {
        return gerente;
    }

    public void setGerente(Employee gerente) {
        this.gerente = gerente;
    }
}

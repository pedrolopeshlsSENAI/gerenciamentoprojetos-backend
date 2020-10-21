package br.com.gerenciamentosprojetos.models.repositories;


import br.com.gerenciamentosprojetos.models.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}

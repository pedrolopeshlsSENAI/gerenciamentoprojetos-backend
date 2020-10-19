package br.com.gerenciamentoprojetos.Repository;

import br.com.gerenciamentoprojetos.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}

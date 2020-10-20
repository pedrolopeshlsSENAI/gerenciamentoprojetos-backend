package br.com.gerenciamentosprojetos.repository;

import br.com.gerenciamentosprojetos.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

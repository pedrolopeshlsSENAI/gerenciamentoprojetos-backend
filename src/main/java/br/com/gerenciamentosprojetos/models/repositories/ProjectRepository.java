package br.com.gerenciamentosprojetos.models.repositories;

import br.com.gerenciamentosprojetos.models.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

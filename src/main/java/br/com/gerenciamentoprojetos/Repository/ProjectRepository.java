package br.com.gerenciamentoprojetos.Repository;

import br.com.gerenciamentoprojetos.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

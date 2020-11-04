package br.com.gerenciamentosprojetos.services.entities;

import br.com.gerenciamentosprojetos.models.entities.Employee;
import br.com.gerenciamentosprojetos.models.entities.Project;
import br.com.gerenciamentosprojetos.models.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List <Project> index(){return projectRepository.findAll();}

    public Project store(Project new_project){
        Project createdProject = projectRepository.save(new_project);

        return createdProject;
    }
}

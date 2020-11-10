package br.com.gerenciamentosprojetos.controllers;

import br.com.gerenciamentosprojetos.models.entities.Employee;
import br.com.gerenciamentosprojetos.models.entities.Project;
import br.com.gerenciamentosprojetos.services.entities.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public Object index(){
        return projectService.index();
    }

    @PostMapping
    public Object store(@RequestBody Project project) throws Exception{
        try{
            System.out.println(project.getName());
            return projectService.store(project);
        }
        catch(Exception e){
            System.out.println(e);
            return e;
        }
    }
//    public Object store(@RequestBody Project project) throws Exception{
//        try{
////            System.out.println(employee.getNome());
//            return projectService.store(project);
//
//        }catch (Exception e){
//            System.out.println(e);
//            return e;
//        }
//    }
}

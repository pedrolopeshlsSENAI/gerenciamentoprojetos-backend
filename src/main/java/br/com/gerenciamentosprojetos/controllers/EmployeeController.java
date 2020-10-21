package br.com.gerenciamentosprojetos.controllers;

import br.com.gerenciamentosprojetos.models.entities.Employee;
import br.com.gerenciamentosprojetos.services.entities.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public Object index(){
        return employeeService.index();
    }

    @PostMapping
    public Object store(@RequestBody Employee employee) throws Exception{
        try{
//            System.out.println(employee.getNome());
            return employeeService.store(employee);
        }catch (Exception e){
            System.out.println(e);
            return e;
        }
    }
}

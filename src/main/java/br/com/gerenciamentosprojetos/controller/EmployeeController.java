package br.com.gerenciamentosprojetos.controller;

import br.com.gerenciamentosprojetos.model.Employee;
import br.com.gerenciamentosprojetos.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee/list")
    public List<Employee> getAllEmployees(){
        System.out.println("FOI AQUI EIN");
        List<Employee> lists = employeeRepository.findAll();
        return lists;
    }

    @PostMapping("/employee/save")
    @ResponseBody
    public Object saveEmployee(Employee employee) {
        try {
            Employee newEmployee = employeeRepository.save(employee);
            System.out.println("FOI AQUI EIN");
            return newEmployee;
        }
        catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return e;
        }

    }
}

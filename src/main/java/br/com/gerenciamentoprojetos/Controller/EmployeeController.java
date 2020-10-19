package br.com.gerenciamentoprojetos.Controller;

import br.com.gerenciamentoprojetos.Model.Employee;
import br.com.gerenciamentoprojetos.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.List;

public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee/list")
    public List<Employee> getAllEmployees(){
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

package br.com.gerenciamentosprojetos.services.entities;

import br.com.gerenciamentosprojetos.models.entities.Employee;
import br.com.gerenciamentosprojetos.models.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> index(){return employeeRepo.findAll();}

    public Employee store(Employee new_employee){

        return employeeRepo.save(new_employee);

    }
}

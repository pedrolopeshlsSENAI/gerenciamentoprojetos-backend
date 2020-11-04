package br.com.gerenciamentosprojetos.services.entities;

import br.com.gerenciamentosprojetos.models.entities.Employee;
import br.com.gerenciamentosprojetos.models.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> index(){return employeeRepository.findAll();}

    public Employee store(Employee new_employee){
        Employee createdEmployee = employeeRepository.save(new_employee);

        return createdEmployee;
    }
}

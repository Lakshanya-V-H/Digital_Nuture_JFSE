package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.EmployeeService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
        System.out.println("Inside main");
    }

//    @Override
//    public void run(String... args) throws Exception {
//        List<Country> list = countryRepository.findAll();
//        list.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
//    }
    @Override
    public void run(String... args) throws Exception {
        Employee e = new Employee();
        e.setId(101);
        e.setName("Lakshmanan");
        e.setSalary(50000);
        employeeService.addEmployee(e);
    }
}

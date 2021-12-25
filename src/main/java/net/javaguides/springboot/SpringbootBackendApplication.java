package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {


/*
		Employee employee=new Employee();
		employee.setFirstName("Hardik");
		employee.setLastName("Mangukiya");
		employee.setEmailId("hardik.mangukiya.003@gmail.com");

		employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee1.setFirstName("Zeel");
		employee1.setLastName("Mangukiya");
		employee1.setEmailId("Zeel.mangukiya.003@gmail.com");
		employeeRepository.save(employee1);*/
	}
}

package com.jpa;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	private EmployeeRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Employee e=new Employee(98,"ravi", "ravi@123", "ravi@gmail.com", "tcs", "developer", "50000", 7842396501l);
//		Employee e1=new Employee(78,"vikas", "vikas@123", "vikas@gmail.com", "wipro", "developer", "45000", 6302723318l);
//		Employee e2=new Employee(35,"naveen", "naveen@123", "naveen@gmail.com", "tcs", "developer", "35000", 7842396501l);
//		repo.save(e);
//		repo.save(e1);
//		repo.save(e2);
//		Employee emp=repo.findById(78).get();
//		emp.setEmpCompanyName("Tcs");
//		emp.setEmpSalary("55000.45");
//		emp.setEmpEmail("vikaspandari@gmail.com");
//		repo.save(emp);
//		
//		repo.deleteById(35);
//		System.out.println("one record is deleted");
		System.out.println("****Get One Record***");
		Employee emp=repo.findById(78).get();
		System.out.println(emp);
		System.out.println("****Get All record****");
		repo.findAll().forEach(e->System.out.println(e));
		
	}

}

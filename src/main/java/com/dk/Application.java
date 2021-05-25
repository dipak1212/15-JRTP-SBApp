package com.dk;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dk.entity.Employee;
import com.dk.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmpRepository empRepository = context.getBean(EmpRepository.class);
		/*Employee emp = new Employee();
		emp.setEmpId(102);
		emp.setEmpName("Avinash");
		emp.setEmpSal(34000.0);
		
		empRepository.save(emp);
		
		System.out.println("Record saved successsfully..!");
		*/
		
	/*	Employee e1 = new Employee(104,"Dipak",32000.00);
		Employee e2 = new Employee(105,"Dipali",29000.00);
		Employee e3 = new Employee(106,"Dips",15999.00);
		
		List<Employee> emp = new ArrayList<>() ;
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		empRepository.saveAll(emp);
		*/
		
		
		/*Optional<Employee> findById = empRepository.findById(161);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		else {
			System.out.println("No Record Available...");
		}*/
		
		
		//findAllById
		/*List <Serializable> empIds= new ArrayList<>();
		empIds.add(101);
		empIds.add(102);
		empIds.add(103);
		
		Iterable<Employee> emps = empRepository.findAllById(empIds);
		emps.forEach(emp ->{
			System.out.println(emp);
		});*/
		
		//findAll
		/*Iterable<Employee> findAll = empRepository.findAll();
		findAll.forEach(emp -> System.out.println(emp));
		*/
		
/*		long count = empRepository.count();
		System.out.println("Total REcords ::" +count);
		
*/		//existById
		/*boolean isAvailable = empRepository.existsById(101);
		System.out.println("Emp Available:: "+ isAvailable);*/
		
		//deleteById
		/*empRepository.deleteById(101);
		*/
	system.out.println("Hello dipak");
	List<Employee> findByEmpName = empRepository.findByEmpName("dipak");
	System.out.println(findByEmpName);
	
	List<Employee> findByEmpSal = empRepository.findByEmpSal(15999.00);
	System.out.println(findByEmpSal);
	
	List<Employee> findByEmpNameAndEmpSal  = empRepository.findByEmpNameAndEmpSal("Dips", 15999);
	System.out.println(findByEmpNameAndEmpSal);
	
	List<Employee> findEmpSalaryGreaterThank = empRepository.findByEmpSalGreaterThan(20000.0);
	System.out.println(findEmpSalaryGreaterThank);
	
	}
}

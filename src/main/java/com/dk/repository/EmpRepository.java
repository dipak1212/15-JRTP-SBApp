package com.dk.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dk.entity.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee, Serializable> {

	public List<Employee> findByEmpName(String name);
	
	public List<Employee> findByEmpSal(Double salary);
	
	public List<Employee> findByEmpNameAndEmpSal(String name,double salary);
	
	public List<Employee> findByEmpSalGreaterThan(double  salary);
}
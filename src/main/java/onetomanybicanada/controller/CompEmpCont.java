package onetomanybicanada.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanybicanada.dao.CompanyDao;
import onetomanybicanada.dao.EMployeeDao;
import onetomanybicanada.dto.Company;
import onetomanybicanada.dto.Employee;

public class CompEmpCont {
public static void main(String[] args) {
//	Company company=new Company();
//	company.setId(1);
//	company.setName("TY");
//	
//	
//	Employee employee1=new Employee();
//	employee1.setId(100);
//	employee1.setName("Poojitha");
//	employee1.setCompany(company);
//	
//	Employee employee2=new Employee();
//	employee2.setId(200);
//	employee2.setName("aryan");
//	employee2.setCompany(company);
//	
//	List<Employee> employees=new  ArrayList<Employee>();
//	employees.add(employee1);
//	employees.add(employee2);
//	company.setEmployees(employees);
//	
//	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
//	entityManager.persist(employee1);
//	entityManager.persist(employee2);
//	entityManager.persist(company);
//	entityTransaction.commit();
//	
//	
//	EMployeeDao dao=new EMployeeDao();
//	dao.deleteEMployee(200);
	
	CompanyDao companyDao=new CompanyDao();
	companyDao.deleteCompany(1);
	
	
	
	
	
	
	
	
	
	
}
}

package com.genpact.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.genpact.dao.EmpDao;
import com.genpact.entity.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmpDao edao = (EmpDao)context.getBean("empDao");
		Employee e = new Employee();
		e.setEname("Sandeep");
		//e.setEmpno(122);
		e.setSalary(12323);
		int id = edao.insert(e);
		System.out.println("Record inserted  with id : "+id);
		
	}

}

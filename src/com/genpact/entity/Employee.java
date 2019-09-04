package com.genpact.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="emp40")

public class Employee {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name="increment" ,strategy = "increment")
	private int empno;
	@Column(length = 15)
	private String ename;
	
	private int salary;

	public Employee() {
		super();
	}

	public Employee(int empno, String ename, int salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public String toString() {
		return empno+"  "+ename+"  "+salary;
	}
	

}

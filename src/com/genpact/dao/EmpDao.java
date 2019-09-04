package com.genpact.dao;

import java.util.List;

import com.genpact.entity.Employee;

public interface EmpDao {
	int insert(Employee e);
	List<Employee>displayAll();
	void delete(int empno);

}

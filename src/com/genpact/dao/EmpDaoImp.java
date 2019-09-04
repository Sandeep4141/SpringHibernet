package com.genpact.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.genpact.entity.Employee;

public class EmpDaoImp implements EmpDao{
     private SessionFactory sessionFactory;  //core container will automatically create sessionFactory without implements 
	public int insert(Employee e) 
	{
		Session session=null;
		int id=0;
		try {
			session  = sessionFactory.openSession();
			Transaction tr= null;
			tr = session.beginTransaction();
			id= (Integer)session.save(e);//jdbc code is present in this method ,abstract
			tr.commit();
		}
		catch(HibernateException he) {
			he.printStackTrace();
			
		}
		finally {
			session.close();
		}
		return id;
	}


	public List<Employee> displayAll() {
		return null;
	}

	
	public void delete(int empno) {
		
		
	}




	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}

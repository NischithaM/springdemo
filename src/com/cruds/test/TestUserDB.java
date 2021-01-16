package com.cruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.db.DepartmentDAO;
import com.cruds.db.UserDAO;

public class TestUserDB {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		UserDAO dao=(UserDAO) context.getBean("userDAOImpl");
		dao.create(2, "guru");
		System.out.println("data inserted successfully ");

	}

}

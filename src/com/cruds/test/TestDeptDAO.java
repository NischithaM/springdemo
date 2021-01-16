package com.cruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.db.DepartmentDAO;
import com.cruds.entity.Department;
import com.cruds.service.DepartmentService;

public class TestDeptDAO {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		/*DepartmentDAO dao=(DepartmentDAO) context.getBean("departmentDAOImpl");*/
		/*dao.create(12, "IS");*/
		
		
		//service method;
		DepartmentService ds=(DepartmentService) context.getBean("departmentService");
		/*ds.create(13, "EC");*/
		/*ds.create(new Department(14, "EEE"));
		System.out.println("data inserted successfully ");*/
		
		//System.out.println(ds.get(11));
		System.out.println(ds.listdepartment());
		Department d=new Department(12, "XXX");
		ds.delete(13);
		ds.update(d);
		System.out.println(ds.listdepartment());
	}

}

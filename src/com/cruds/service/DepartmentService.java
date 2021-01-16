package com.cruds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.DepartmentDAO;
import com.cruds.entity.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;
	
	public void create(/*Integer id,String name*/Department d)
	{
		departmentDAO.create(d);
	}
	
	public Department get(int deptid)
	{
		return departmentDAO.get(deptid);
	}
	
	public List<Department> listdepartment()
	{
		return departmentDAO.listDepartment();
	}
	
	public void delete(int deptid)
	{
		 departmentDAO.delete(deptid);
	}
	
	public void update(Department d)
	{
		departmentDAO.update(d);
	}
}

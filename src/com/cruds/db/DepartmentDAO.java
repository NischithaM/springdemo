package com.cruds.db;

import java.util.List;

import com.cruds.entity.Department;

public interface DepartmentDAO {

	/*public void create(Integer deptid,String deptname);*/
	
	public void create(Department d);//through entity class
	
	public Department get(int deptid);
	
	public List<Department> listDepartment();
	
	public void delete(int deptid);
	
	public void update(Department d);
}

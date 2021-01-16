package com.cruds.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/ // for component scan
	
	public void create(/*Integer deptid,String deptname*/Department d)
	{
		String sql="insert into department(deptid,deptname) values(?,?)";
		/*jdbcTemplate.update(sql, new Object[]{deptid,deptname});*/
		
		jdbcTemplate.update(sql,new Object[]{d.getDeptid(),d.getDeptname()});
	}

	@Override
	public Department get(int deptid) {
		String sql="select * from department where deptid=?";
		Department d=jdbcTemplate.queryForObject(sql, new Object[]{deptid}, new DeptRowMapper());
		return d;
	}
	
	class DeptRowMapper implements RowMapper<Department>
	{

		@Override
		public Department mapRow(ResultSet rs, int rowmap) throws SQLException {
			Department d=new Department();
			d.setDeptid(rs.getInt(1));
			d.setDeptname(rs.getString(2));
			return d;
		}
		
	}

	@Override
	public List<Department> listDepartment() {
		String sql="select * from department";
		List<Department> deptlist=jdbcTemplate.query(sql, new DeptRowMapper());
		return deptlist;
	}

	@Override
	public void update(Department d) {
		String sql="update department set deptname=? where deptid=?";
		jdbcTemplate.update(sql, new Object[]{d.getDeptname(),d.getDeptid()});
	}

	@Override
	public void delete(int deptid) {
		String sql="delete from department where deptid=?";
		jdbcTemplate.update(sql, new Object[]{deptid});
		
	}

	
	
	
}

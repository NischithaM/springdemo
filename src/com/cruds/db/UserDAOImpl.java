package com.cruds.db;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAOImpl implements UserDAO{

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public void create(Integer userid, String username) {
		String sql="insert into user(userid,username) values(?,?)";
		jdbcTemplate.update(sql,new Object[]{userid,username});
		
	}

	
}

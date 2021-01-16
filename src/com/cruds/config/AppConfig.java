package com.cruds.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cruds.demo.Address;
import com.cruds.demo.HelloBean;
import com.cruds.demo.User;

//without using application.xml
@Configuration
public class AppConfig {
	
	@Bean
	public Address address()
	{
		return new Address("ss puram", "tumkur");
	}
	
	@Bean
	public User user()
	{
		User user=new User("sada", "INDIA", 40);
		user.setAddress(address());
		return user;
	}
	
	@Bean
	public HelloBean helloBean()
	{
		HelloBean bean=new HelloBean();
		bean.setMsg("HELLO BEAN FROM CONFIG CLASS");
		return bean;
	}
	
}

package com.cruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cruds.config.AppConfig;
import com.cruds.demo.HelloBean;
import com.cruds.demo.User;

public class TestAppConfig {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		User bean=context.getBean(User.class);
		/*System.out.println(bean.getMsg());*/
		System.out.println(bean);
	}

}

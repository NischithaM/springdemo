package com.cruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cruds.config.AppConfig;
import com.cruds.config.BookConfig;
import com.cruds.demo.Book;
import com.cruds.demo.HelloBean;

public class TestBookConfig {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BookConfig.class);
		Book bean=context.getBean(Book.class);
		System.out.println(bean);
	}
	
}

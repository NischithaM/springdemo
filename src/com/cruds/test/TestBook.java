package com.cruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.demo.Book;

public class TestBook {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Book b=(Book) context.getBean("book");
		System.out.println(b);
		
		

	}

}

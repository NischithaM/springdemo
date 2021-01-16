package com.cruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.demo.HelloBean;

public class TestHelloBean {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		HelloBean bean=(HelloBean) context.getBean("helloBean");
		System.out.println(bean.getMsg());
		
		HelloBean bean1=(HelloBean) context.getBean("helloBean");
		System.out.println(bean1.getMsg());
	}

}

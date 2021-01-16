package com.cruds.demo;

public class HelloBean {

	private String msg;

	public HelloBean() {
		super();
		
		System.out.println("INSIDE HELLOBEAN CONSTRUCTOR");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("INSIDE BEAN SETTER");
	}
	
}

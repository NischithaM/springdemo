package com.cruds.demo;

public class Author {

	private String name;
	private String mailid;
	
	public Author() {
		super();
	}
	
	
	public Author(String name, String mailid) {
		super();
		this.name = name;
		this.mailid = mailid;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", mailid=" + mailid + "]";
	}
	
	
	
}

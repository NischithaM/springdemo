package com.cruds.demo;

public class User {

	private String name;
	private String country;
	private int age;
	
	private Address address;
	/*
	
	public User() {
		super();
	}*/
	public User(String name, String country, int age) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
	}
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public User(String name, String country, int age, Address address) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
		this.address = address;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", country=" + country + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
}

package com.singleinheri;

public class Employee {
	
	private int eid;
	private String name;
	private float salary;
	static String company="HCL";
		
	public Employee() {
		
	}


	public Employee(int eid, String name, float salary) {
		
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public static String getCompany() {
		return company;
	}


	public static void setCompany(String company) {
		Employee.company = company;
	}


   
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	}

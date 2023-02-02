package com.demo;

public class Department {
	private int id;
	private String name;

	public Department() {

	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "DepartmentId:-" + id + "\nDepartmentName:-" + name;
	}
}

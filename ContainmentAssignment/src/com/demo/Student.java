package com.demo;

public class Student {
	private int rollno;
	private String name;

	public Student() {

	}

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public String toString() {
		return "StudentRollno:" + rollno + "\nStudentName:" + name;
	}
}

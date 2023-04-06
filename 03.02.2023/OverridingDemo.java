package com.methodoverriding;

class Person {

	 void display() {
		System.out.println("I am a person");
	}

}

class Employee extends Person
{
	@Override
	protected void display() {
		System.out.println("I am a working person");
	}

}

class HomePerson extends Person
{
	@Override
	public void display() {
		System.out.println("I am a home person");
	}

}



public class OverridingDemo {

	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.display();
		
		HomePerson p1= new HomePerson();
		p1.display();

	}

}

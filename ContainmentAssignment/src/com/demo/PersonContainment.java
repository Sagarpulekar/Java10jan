package com.demo;

import java.util.Scanner;

public class PersonContainment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		System.out.println("ENTER ID:");
		int id = sc.nextInt();
		System.out.println("ENTER NAME:");
		String name = sc.next();
		System.out.println("ENTER AGE:");
		int age = sc.nextInt();

		Address a1 = new Address();
		System.out.println("------ENTER ADDRESSS DETAILS-------");
		System.out.println("ENTER SOCIETY NAME:");
		String society = sc.next();
		System.out.println("ENTER CITY NAME :");
		String city = sc.next();
		System.out.println("ENTER PINCODE:");
		int pin = sc.nextInt();
		System.out.println("ENTER SURVEY NUMBER:");
		int srno = sc.nextInt();

	}

}

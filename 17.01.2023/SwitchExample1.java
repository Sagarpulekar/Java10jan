package com.demo;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the day:");
		int dayOfWeek = sc.nextInt();

		// byte,short, int, long, char
		// jdk 7: enum/String/ wrapper
		// varible: finite value
		switch (dayOfWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Wrong input");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		}

	}

}

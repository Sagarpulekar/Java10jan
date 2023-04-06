package com.demo;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
		int flag = 0;
		switch (ch) {

		case 'a':
		case 'A':
		case 'E':
		case 'e':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vowel");
			flag = 1;
			break;

		}

		if (flag == 0) {
			System.out.println("It is a consonant");
		}

	}

}

package com.trenary;

public class BitwiseOperations {

	public static void main(String[] args) {
      
		int a=5;
		int b=7;
		System.out.println("Bitwise Or:"+ (a|b));
		System.out.println("Bitwise And:"+ (a&b));
		System.out.println("Bitwise Xor:"+ (a^b));
		System.out.println("Bitwise Not:"+ (~a));
		//System.out.println("Bitwise Not:"+ (!a));
		// 0000  0101 ->1111 1010
		System.out.println("Bitwise And:"+ (a&b));
		
		System.out.println("Left shift:"+ (12<<2));
		
		
	}

}

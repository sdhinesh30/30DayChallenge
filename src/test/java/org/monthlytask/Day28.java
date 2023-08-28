package org.monthlytask;

import java.util.Scanner;

public class Day28 {

	// convert from number to binary
	public static String addNumber(String b1, String b2) {
		int num1 = Integer.parseInt(b1, 2);
		int num2 = Integer.parseInt(b2, 2);
		int sum = num1 + num2;
		String binaryString = Integer.toBinaryString(sum);
		return binaryString;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first binary: ");
		String b1 = sc.next();
		System.out.println("Enter the second binary: ");
		String b2 = sc.next();
		
		System.out.println(addNumber(b1, b2));

	}
}

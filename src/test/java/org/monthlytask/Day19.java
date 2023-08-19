package org.monthlytask;

import java.util.Scanner;

public class Day19 {

	// Basic Calculator functions
	
	public static int inputValue1(Scanner sc) {
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		return num1;
	}
	public static int inputValue2(Scanner sc) {
		System.out.println("Enter the first number: ");
		int num2 = sc.nextInt();
		return num2;
	}

	public static int add(Scanner sc) {
		return inputValue1(sc) + inputValue2(sc);
	}

	public static int sub(Scanner sc) {
		return inputValue1(sc) - inputValue2(sc);
	}

	public static int mul(Scanner sc) {
		return inputValue1(sc) * inputValue2(sc);
	}

	public static int div(Scanner sc) {
		return inputValue1(sc) / inputValue2(sc);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean status = true;
		while (status) {

			System.out.println("Basic Calculator\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit ");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				System.out.println("Addition: " + add(sc) + "\n");
				break;
			case 2:
				System.out.println("Subtraction: " + sub(sc) + "\n");
				break;
			case 3:
				System.out.println("Multiplication: " + mul(sc) + "\n");
				break;
			case 4:
				System.out.println("Division: " + div(sc) + "\n");
				break;
			case 5:
				status=false;
			}
		}
	}

}

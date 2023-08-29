package org.monthlytask;

import java.util.Scanner;

public class Day29 {

	// Fibonacci series And Factorial
	public static void fibonacciSeries(int num) {
		int a = 0, b = 1;
		System.out.println(a);
		System.out.println(b);

		for (int i = 2; i < num; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

	public static int factorial(int f) {

		int fact = 1;
		for (int i = 1; i <= f; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		fibonacciSeries(num);

		System.out.println("\nEnter the number to find factorial: ");
		int f = sc.nextInt();
		System.out.println(factorial(f));
	}
}

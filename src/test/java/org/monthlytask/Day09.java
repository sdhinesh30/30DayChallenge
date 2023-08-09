package org.monthlytask;

import java.util.Scanner;

public class Day09 {

	// Prime number
	public static int primeNumber(int num) {
		int flag = 0;
		if (num == 0 || num == 1) {
			flag=1;
		} else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					flag = 0;
				} else {
					flag = 1;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		int flag = primeNumber(num);

		if (flag == 1) {
			System.out.println("Given number "+ num + " is prime number");
		} else {
			System.out.println("Given number "+ num + " is not prime number");
		}
	}

}

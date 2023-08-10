package org.monthlytask;

import java.util.Scanner;

public class Day10 {

	// diamond

	public static void diamond(int num) {
		
		for (int i = 0; i < num; i++) {
			for (int j = num - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < num - i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int num = sc.nextInt();

		diamond(num);
	}

}

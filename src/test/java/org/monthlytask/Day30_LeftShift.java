package org.monthlytask;

import java.util.Arrays;
import java.util.Scanner;

public class Day30_LeftShift {

	// Find the second-highest number in an array.

	public static int[] leftShift(int[] a, Scanner sc) {

		System.out.println("Enter the number of digit to be shift: ");
		int shift = sc.nextInt();
		for (int i = 0; i < shift; i++) {
			int first = a[0];
			for (int j = 1; j < a.length; j++) {
				a[j - 1] = a[j];
			}
			a[a.length - 1] = first;
		}
		return a;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Left Shift: \n" + Arrays.toString(leftShift(a, sc)));
	}
}

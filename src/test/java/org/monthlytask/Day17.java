package org.monthlytask;

import java.util.Arrays;
import java.util.Scanner;

public class Day17 {

	// Insert a number to any position in an array
	public static void changePosition(int[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be insert in an array: ");
		int num = sc.nextInt();
		System.out.println("Enter the position to insert the element: ");
		int pos = sc.nextInt();

		for (int i = a.length - 1; i > pos; i--) {
			a[i] = a[i - 1];
		}
		a[pos] = num;
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		changePosition(a);
	}
}

package org.monthlytask;

import java.util.Arrays;

public class Day01 {

	// Day01- Find the least difference number in array

	public static void difference(int a1[]) {
		int min = Integer.MAX_VALUE;
		int x = 0, y = 0;
		for (int i = 0; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				// int temp = a1[i]-a1[j];
				int temp = Math.abs(a1[i] - a1[j]);
				if (min > temp) {
					min = temp;
					x = a1[i];
					y = a1[j];
				}
			}
		}
		System.out.println("Least difference values are " + x + " & " + y + " and difference is " + min);
	}

	public static void main(String args[]) {
		int[] a = { 21, 13, 7, 29, 43, 2 };
		// Using sort method
		Arrays.sort(a);
		difference(a);

		// Without using sort method
		int[] a1 = { 19, 50, 99, 22, 71, 9 };
		difference(a1);
	}

}

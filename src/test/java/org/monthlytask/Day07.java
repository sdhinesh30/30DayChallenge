package org.monthlytask;

import java.util.Arrays;

public class Day07 {

	// Bubble Sort
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length - i; j++) {
				if (a[j - 1] > a[j]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 3, 809, 2, 39, 216, 135, 74 };
		System.out.println("Array before sorting : " + Arrays.toString(a));
		bubbleSort(a);
		System.out.println("Array after sorting : " + Arrays.toString(a));
	}

}

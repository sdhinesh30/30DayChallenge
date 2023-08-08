package org.monthlytask;

import java.util.Arrays;

public class Day08 {

	// Merge sort
	public static void mergeSort(int[] a) {

		int mid = a.length / 2;
		if (a.length <= 1)
			return;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[a.length - mid];

		int i = 0, j = 0;

		for (i = 0; i < a.length; i++) {
			if (i < mid) {
				leftArray[i] = a[i];
			} else {
				rightArray[j] = a[i];
				j++;
			}
		}

		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, a);
	}

	public static void merge(int[] leftArray, int[] rightArray, int[] a) {

		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		int i = 0, l = 0, r = 0;

		while (l < leftSize && r < rightSize) {

			if (leftArray[l] < rightArray[r]) {
				a[i] = leftArray[l];
				i++;
				l++;
			} else {
				a[i] = rightArray[r];
				i++;
				r++;
			}
		}

		while (l < leftSize) {
			a[i] = leftArray[l];
			l++;
			i++;
		}
		while (r < rightSize) {
			a[i] = rightArray[r];
			r++;
			i++;
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 8, 48, 99, 21, 240, 389, 144, 1, 5 };
		System.out.println("Array before sorting: " + Arrays.toString(a));

		mergeSort(a);
		System.out.println("Array after sorting: " + Arrays.toString(a));

	}
}

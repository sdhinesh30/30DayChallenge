package org.monthlytask;

import java.util.Arrays;

public class Day11 {

	// Left and Right rotation

	public static void leftRotate(int[] a, int rotate) {

		for (int i = 0; i < rotate; i++) {
			int first = a[0];
			for (int j = 1; j < a.length; j++) {
				a[j - 1] = a[j];
			}
			a[a.length - 1] = first;
		}
	}

	public static void rightRotate(int[] b, int rotate) {

		for (int i = 0; i < rotate; i++) {
			int last = b[b.length - 1];
			for (int j = b.length - 2; j >= 0; j--) {
				b[j + 1] = b[j];
			}
			b[0] = last;
		}
	}

	public static void main(String[] args) {
		int[] lRotate = { 10, 20, 30, 40, 50, 60 };
		int[] rRotate = { 100, 200, 300, 400, 500, 600 };
		int rotate = 2;

		leftRotate(lRotate, rotate);
		System.out.println("Left Rotate: " + Arrays.toString(lRotate));

		rightRotate(rRotate, rotate);
		System.out.println("Right Rotate: " + Arrays.toString(rRotate));
	}

}

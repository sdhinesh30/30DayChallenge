package org.monthlytask;

import java.util.Arrays;

public class Day11 {

	// Right rotation
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
		int[] rRotate = { 100, 200, 300, 400, 500, 600 };
		int rotate = 2;

		rightRotate(rRotate, rotate);
		System.out.println("Right Rotate: " + Arrays.toString(rRotate));
	}

}

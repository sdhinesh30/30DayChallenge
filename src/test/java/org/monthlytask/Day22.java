package org.monthlytask;

import java.util.Arrays;
import java.util.Scanner;

public class Day22 {

	/*
	 * A chocolate factory is packing chocolates into the packets. The chocolate
	 * packets here represent an array of N number of integer values. The task is to
	 * find the empty packets(0) of chocolate and push it to the end of the conveyor
	 * belt(array). Example 1 : N=8 and arr = [4,5,0,1,9,0,5,0]. There are 3 empty
	 * packets in the given set. These 3 empty packets represented as O should be
	 * pushed towards the end of the array Input : 8 – Value of N [4,5,0,1,9,0,5,0]
	 * – Element of arr[O] to arr[N-1],While input each element is separated by
	 * newline Output: 4 5 1 9 5 0 0 0
	 */

	public static int[] arrayValue(Scanner sc) {
		System.out.println("Enter the Size of the array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array values: " + Arrays.toString(a));
		return a;
	}

	public static void emptyPockets(Scanner sc) {
		int count = 0;
		int[] a = arrayValue(sc);
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != 0) {
				a[count++] = a[i];
			}
		}
		for (int i = count; i < a.length; i++) {
			a[i] = 0;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		emptyPockets(sc);
	}

}

package org.monthlytask;

import java.util.Scanner;

public class Day23 {

	/*
	 * An intelligence agency has received reports about some threats. The reports
	 * consist of numbers in a mysterious method. There is a number “N” and another
	 * number “R”. Those numbers are studied thoroughly and it is concluded that all
	 * digits of the number ‘N’ are summed up and this action is performed ‘R’
	 * number of times. The resultant is also a single digit that is yet to be
	 * deciphered. The task here is to find the single-digit sum of the given number
	 * ‘N’ by repeating the action ‘R’ number of times.
	 * 
	 * If the value of ‘R’ is 0, print the output as ‘0’.
	 */
	public static int individualAddition(int n) {
		int res = 0;
		while (n > 0) {
			int temp = n % 10;
			res = res + temp;
			n = n / 10;
		}
		return res;
	}

	public static int iterateValues(int n, int r) {
		int res = individualAddition(n);
		int value = 0;
		for (int i = 1; i <= r; i++) {
			value = value + res;
		}
		int result = individualAddition(value);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value: ");
		int n = sc.nextInt();

		System.out.println("Enter the R value: ");
		int r = sc.nextInt();

		if (r == 0)
			System.out.println("Output: 0");
		else
			System.out.println("Output: " + iterateValues(n, r));
	}

}

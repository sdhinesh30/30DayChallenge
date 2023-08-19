package org.monthlytask;

import java.util.Scanner;

public class Day18 {

	// Check the Leap year
	public static void leapYear(int year, boolean leap) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else
					leap = false;
			} else
				leap = true;
		} else
			leap = false;

		if (leap == true)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year");
	}

	public static void main(String[] args) {

		boolean leap = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();

		leapYear(year, leap);
	}

}

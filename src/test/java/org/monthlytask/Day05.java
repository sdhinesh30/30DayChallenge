package org.monthlytask;

public class Day05 {

	// Palidrome using numbers and String
	public static void palindrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
		}
		if (s.equals(rev)) {
			System.out.println("Given String is Palidrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	public static void palindrome(int num) {
		int n = num;
		int rev = 0;
		while (num > 0) {
			int temp = num % 10;
			rev = (rev * 10) + temp;
			num = num / 10;
		}
		if (n == rev) {
			System.out.println("Given Number is Palidrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	public static void main(String[] args) {

		palindrome("refer");
		palindrome(323);

	}

}

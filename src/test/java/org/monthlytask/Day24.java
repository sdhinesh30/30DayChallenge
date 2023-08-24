package org.monthlytask;

public class Day24 {

	// Sum of the Numbers in a String
	public static String seperateCharaters(String s) {

		String num = "", values = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				num = num + c;
			} else {
				values = values + c;
			}
		}
		System.out.println("String Characters: " + values);
		return num;
	}

	public static void sumOfNumbers(String s) {
		String num = seperateCharaters(s);
		int res = 0;
		int numbers = Integer.parseInt(num);
		while (numbers > 0) {
			int temp = numbers % 10;
			res = res + temp;
			numbers = numbers / 10;
		}
		System.out.println("Sum of the numbers in a String: " + res);
	}

	public static void main(String[] args) {
		String s = "24Dhin8e3sh25";
		sumOfNumbers(s);
	}

}

package org.monthlytask;

public class Day25 {

	// Find the longest word the given array(don't consider the special characters)
	public static String longWord(String s) {
		String[] eachWords = s.split(" ");
		int max = Integer.MIN_VALUE;
		String longestWord = "";
		for (int i = 0; i < eachWords.length; i++) {
			String removeSpecialChar = eachWords[i].replaceAll("[^A-Za-z0-9]", "");
			int len = removeSpecialChar.length();

			if (len > max) {
				max = len;
				longestWord = removeSpecialChar;
			}
		}
		return longestWord;
	}

	public static void main(String[] args) {
		String s = "Dhinesh Hari Kavitha Varshini Suganthi Sabari Priya Sanjay";
		System.out.println(longWord(s));
	}

}

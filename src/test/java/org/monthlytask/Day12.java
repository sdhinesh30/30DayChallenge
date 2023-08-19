package org.monthlytask;

public class Day12 {

	// Reverse the each word and make first letter capital

	public static void reverseWord(String s) {
		String[] sp = s.split(" ");
		String s3 = "";
		for (int i = 0; i < sp.length; i++) {
			String s1 = sp[i].toLowerCase();
			String s2 = "";
			for (int j = s1.length() - 1; j >= 0; j--) {
				s2 = s2 + s1.charAt(j);
			}
			s3 = s3 + Character.toUpperCase(s2.charAt(0)) + s2.substring(1) + " ";
		}
		System.out.println(s3);
	}

	public static void main(String[] args) {

		String s = "Dhinesh Shanmugasundaram";
		reverseWord(s);

	}

}

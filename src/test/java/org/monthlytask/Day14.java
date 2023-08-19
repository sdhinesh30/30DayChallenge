package org.monthlytask;

import java.util.Arrays;

public class Day14 {

	// Anagram
	public static void anagram(String s1, String s2) {
		if (s1.length() == s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			String s3 = String.valueOf(c1);
			String s4 = String.valueOf(c2);

			if (s3.equals(s4)) {
				System.out.println("Given String is Anagram");
			} else {
				System.out.println("Given String is not Anagram");
			}
		} else {
			System.out.println("Not an anagram - Count mismatch");
		}
	}

	public static void main(String[] args) {
		String s1 = "peach";
		String s2 = "cheap";

		anagram(s1, s2);
	}

}

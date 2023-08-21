package org.monthlytask;

public class Day21 {

	// Get the upper case, lower case, digit and special character from given string

	public static void splitCharacter(String s) {
		String upperCase = "";
		int upperCaseCount = 0;
		String lowerCase = "";
		int lowerCaseCount = 0;
		String digit = "";
		int digitCount = 0;
		String splCharacter = "";
		int splCharacterCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int x = c;
			if (x >= 65 && x <= 90) {
				upperCase = upperCase + c + " ";
				upperCaseCount++;
			} else if (x >= 97 && x <= 122) {
				lowerCase = lowerCase + c + " ";
				lowerCaseCount++;
			} else if (x >= 48 && x <= 57) {
				digit = digit + c + " ";
				digitCount++;
			} else {
				splCharacter = splCharacter + c + " ";
				splCharacterCount++;
			}
		}
		System.out.println("UpperCase: " + upperCase);
		System.out.println("UpperCase Count: " + upperCaseCount);
		System.out.println("LowerCase: " + lowerCase);
		System.out.println("LowerCase Count: " + lowerCaseCount);
		System.out.println("Digit: " + digit);
		System.out.println("Digit Count: " + digitCount);
		System.out.println("Special Character: " + splCharacter);
		System.out.println("Special Character Count: " + splCharacterCount);
	}

	public static void main(String[] args) {

		String s = "TestingApp83@sample.com";
		splitCharacter(s);
	}

}

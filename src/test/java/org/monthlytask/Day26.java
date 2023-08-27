package org.monthlytask;

public class Day26 {

	// Print the words which is match with "abcghe"
	public static String StringCompare(String[] s) {
		
		String firstWord = s[0];
		String remaining = s[1];
		String[] eachWord = remaining.split(",");
		String secondWord = "";
		for (int i = 0; i < eachWord.length; i++) {
			for (int j = i; j < eachWord.length; j++) {
				String combineWord = eachWord[i] + eachWord[j];
				if (firstWord.equals(combineWord)) {
					secondWord = eachWord[i] + "," + eachWord[j];
				}
			}
		}
		return secondWord;
	}

	public static void main(String[] args) {
		String[] s = { "abcghe", "a,ab,abc,c,cg,gh,ghe" };
		System.out.println(StringCompare(s));
	}

}

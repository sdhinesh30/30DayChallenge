package org.monthlytask;

public class Day06 {
	
	//Each letter first word capital
	public static String firstWordCapital(String s) {
		String[] sp = s.split(" ");
		String result = "";
		for (int i = 0; i < sp.length; i++) {
			char c = Character.toUpperCase(sp[i].charAt(0));
			String sub = sp[i].substring(1);
			result = result + c + sub + " ";
		}
		return result;
	}

	public static void main(String[] args) {

		String s = "sixth day practice program";
		System.out.println(firstWordCapital(s));
	}

}

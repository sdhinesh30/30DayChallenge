package org.utility;

public class UtilityClass {

	public static String stringReverse(String getDates) {   //2019-03-27 18:00:00
		
		String reverse = "";
		String rev = "", x = "";
		String[] dates = getDates.split(" ");   //2019-03-27   //18:00:00
		for (int i = 0; i < dates.length; i++) {
			String[] date = dates[i].split("-"); // 2019 // 03 //27 //

			for (int j = date.length - 1; j >= 0; j--) {
				rev = rev + date[j] + "-";
			}
			x = rev.substring(0, 10);
			reverse = x.replace("[", "");
		}
		return reverse;
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String reverse = "";
		String[] getDate = getDates.split(" "); // "2019-03-27"  //"18:00:00"
		for (int i = 0; i < getDate.length; i++) {
			String rev = ""; 
			String[] date = getDate[i].split("-");
			for (int j = date.length - 1; j >= 0; j--) {
				rev = rev + date[j] + "-";
			}
			reverse = rev.substring(0, 10);
		}
		System.out.println(reverse);
		return reverse;
	}*/

}

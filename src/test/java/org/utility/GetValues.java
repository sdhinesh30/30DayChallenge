package org.utility;

import java.util.Scanner;

import io.restassured.path.json.JsonPath;

public class GetValues {

	public static String values(JsonPath path, String key1, String key2 ) {
		System.out.println("Enter the date: ");
		Scanner sc = new Scanner(System.in);
		String userDate = sc.nextLine();
		String data = "", temp = "";
		int size = path.getInt("list.size()");
		for (int i = 0; i < size; i++) {
			String getDates = path.getString("list.dt_txt[" + i + "]"); 
			data = UtilityClass.stringReverse(getDates);
			String jsonValues = "";
			if (userDate.equals(data)) {
				jsonValues = path.getString("list."+key1+"[" + i + "]."+key2);
				temp = temp + jsonValues + "\n";
			}
		}
		return temp;
	}
}

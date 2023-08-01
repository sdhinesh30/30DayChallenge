package org.interview;
import java.io.File;
import java.util.Scanner;

import org.utility.GetValues;
import org.utility.UtilityClass;

import io.restassured.path.json.JsonPath;

public class GetInformation {

	public static void main(String[] args) {

		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Payload\\data.json");
		JsonPath path = new JsonPath(file);
		boolean x = true;
		while (x) {
			System.out.println(
					"1. Get weather\r\n" + "2. Get Wind Speed\r\n" + "3. Get Pressure\r\n" + "0. Exit\r\n" + " ");
			System.out.println("Choose the Option: ");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {

			case 0: {
				x = false;
				System.out.println("Terminated");
				System.exit(0);
			}
			case 1: {
				String temp = GetValues.values(path, "main", "temp");
				System.out.println("Temperature : \n" + temp);
				break;
			}
			case 2: {
				String speed = GetValues.values(path, "wind", "speed");
				System.out.println("Wind Speed : \n" + speed);
				break;
			}
			case 3: {
				String pressure = GetValues.values(path, "main", "pressure");
				System.out.println("Pressure : \n" + pressure);
				break;
			}
			}
		}
	}
}

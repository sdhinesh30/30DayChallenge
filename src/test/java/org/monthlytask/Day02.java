package org.monthlytask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Day02 {
	
	/*100 bulbs in a room. first user enters the room and turn on all the bulbs
	2nd user enters and he/she turn on the multiplies of 2 bulb which is in off state. 
	and turn off the multiplies of 2 bulb which is on state. the same process is happen
	for every users and bulb will be considered multiplies of the users.*/
	
	public static Map<Integer, String> userLogic(int user) {
		Map<Integer, String> mp = new LinkedHashMap<Integer, String>();
		for(int i=1;i<=100;i++) {
			mp.put(i, "Turn off");
		}
		for(int i=1;i<=user;i++) {
			for(int j=i;j<=100;j++) {
				if(j%i==0) {
					if(mp.get(j).equals("Turn off")) {
						mp.put(j, "Turn on");
					}
					else {
						mp.put(j, "Turn off");
					}
				}
			}
		}
		return mp;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users: ");
		int user = sc.nextInt();
		
		Map<Integer, String> mp = userLogic(user);
		Set<Entry<Integer, String>> en = mp.entrySet();
		for(Entry<Integer, String> e : en) {
			System.out.println(e.getKey()+" - "+e.getValue());
		}
	}

}

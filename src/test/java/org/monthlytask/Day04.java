package org.monthlytask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day04 {

	// occurance of characters in the word
	public static Map<Character, Integer> occurance(String s1) {
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (mp.containsKey(c)) {
				Integer count = mp.get(c);
				mp.put(c, count + 1);
			} else {
				mp.put(c, 1);
			}
		}
		return mp;
	}

	public static void main(String[] args) {
		String s = "practice program";
		String s1 = s.replace(" ", "");

		Map<Character, Integer> mp = occurance(s1);
		Set<Entry<Character, Integer>> en = mp.entrySet();
		for (Entry<Character, Integer> e : en) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
	}
}

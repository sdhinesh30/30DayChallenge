package org.monthlytask;

import java.util.LinkedHashSet;
import java.util.Set;

public class Day20 {

	// Removing repeated elements from an array
	public static Set<Integer> removingDuplicate(int[] a) {
		Set<Integer> se = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			se.add(a[i]);
		}
		return se;
	}

	public static void main(String[] args) {
		int[] a = { 10, 40, 52, 72, 10, 40, 21, 52 };

		Set<Integer> se = removingDuplicate(a);
		System.out.println("After removing duplicates: ");
		for (Integer e : se) {
			System.out.print(e + " ");
		}
	}

}

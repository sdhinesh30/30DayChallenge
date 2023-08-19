package org.monthlytask;

public class Day16 {

	// Find common values from 2 arrays
	public static void commonValues(int[] a, int[] b) {
		System.out.println("Common values of two arrays: ");
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(b[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = { 2, 5, 10, 43, 28, 73 };
		int[] b = { 11, 5, 43, 73, 99, 243 };
		
		commonValues(a, b);
	}
}

package org.monthlytask;
import java.util.Arrays;

public class Day03 {

	// Binary search
	public static void binarySearch(int first, int last, int a[], int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (key > a[mid]) { // 30>55
				first = mid + 1;
			} 
			else if (key == a[mid]) {
				System.out.println("Element found at this position: " + mid);
				break;
			} 
			else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
	}

	public static void main(String[] args) {

		int a[] = { 10, 40, 20, 55, 90, 30, 25 };
		int key = 55;
		Arrays.sort(a); // 10, 20, 25, 30, 40, 55, 90
		int last = a.length - 1; // 90
		binarySearch(0, last, a, key);
	}
}

package org.monthlytask;

public class Day13 {

	// Second largest number
	public static void secondLargestValue(int a[], int largest, int secLargest) {
		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {
				secLargest = largest;
				largest = a[i];
			} else if (a[i] > secLargest && largest != a[i]) {
				secLargest = a[i];
			}
		}
		System.out.println("Largest value: " + largest);
		System.out.println("Second Largest value: " + secLargest);
	}

	public static void main(String args[]) {
		int a[] = { 2, 40, 58, 592, 11, 592, 376, 422, 6, 986 };

		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		secondLargestValue(a, largest, secLargest);
	}

}

package org.monthlytask;

public class Day27 {

	/*
	 * Given an integer array Arr of size N the task is to find the count of
	 * elements whose value is greater than all of its prior elements.
	 * 
	 * Note : 1st element of the array should be considered in the count of the
	 * result.
	 * 
	 * For example, Arr[]={7,4,8,2,9} As 7 is the first element, it will consider in
	 * the result. 8 and 9 are also the elements that are greater than all of its
	 * previous elements. Since total of 3 elements is present in the array that
	 * meets the condition.
	 * 
	 * Hence the output = 3.
	 */

	public static void main(String[] args) {
		int[] arr = { 7, 4, 8, 2, 9 };

		int count = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				count++;
			}
		}
		System.out.println(count);
	}

}
